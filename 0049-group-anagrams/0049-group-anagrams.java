class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String word = strs[i];
            char letter[]=word.toCharArray();
            Arrays.sort(letter);
            String sortedword = new String(letter);
            
            if(!map.containsKey(sortedword))
            {
                List<String> newlist = new ArrayList<>();
                newlist.add(word);
                map.put(sortedword,newlist);
            }
            else
            {
                map.get(sortedword).add(word);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(String key: map.keySet())
        {
         result.add(map.get(key));
        }
        return result;
        }
}