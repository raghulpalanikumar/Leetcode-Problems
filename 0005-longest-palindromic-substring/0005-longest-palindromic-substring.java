class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            String odd = expand(s, i, i);   // Odd-length palindrome
            String even = expand(s, i, i+1); // Even-length palindrome
            
            if (odd.length() > longest.length()) longest = odd;
            if (even.length() > longest.length()) longest = even;
        }
        
        return longest;
    }
    
    private String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
}
