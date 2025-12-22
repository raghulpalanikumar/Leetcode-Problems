class Solution {
    public int lengthOfLastWord(String s) {
       // String ss=s.trim();
       //String arr[]=ss.split(" ");
       //return arr[arr.length-1].length();
       //another logic is there. back la irunthu va and space irutha neglect and leading space ao
       int count=0;
       for(int i=s.length()-1;i>=0;i--)
       {
        if(s.charAt(i)==' '&&i==s.length()-1 )
        {
            count++;
        }
        else if(s.charAt(i)!=' ')
        {
            count++;
        }
        else{
            break;
        }
       }
       return count;
    }
}