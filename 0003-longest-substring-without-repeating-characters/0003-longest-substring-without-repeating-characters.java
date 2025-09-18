import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int maxLen = 0;
        HashSet<Character> st = new HashSet<>();

        while (right < s.length()) {
            char ch = s.charAt(right);

            if (!st.contains(ch)) {
                st.add(ch);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                st.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }
}
