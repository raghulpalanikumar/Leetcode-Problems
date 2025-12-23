import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String sortedWord = new String(letters);

            if (!map.containsKey(sortedWord)){
                List<String> newList = new ArrayList<>();
                newList.add(word);
                map.put(sortedWord, newList);
            } else {
                map.get(sortedWord).add(word);
            }
        }
        List<List<String>> result = new ArrayList<>();

        for (String key : map.keySet()) {
            result.add(map.get(key));
        }
        return result;
    }
}
