class Solution {
    public int lengthOfLastWord(String s) {
        String ss=s.trim();
        String arr[]=ss.split(" ");
        return arr[arr.length-1].length();
            }
}