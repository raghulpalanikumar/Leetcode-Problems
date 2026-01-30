class Solution {
    public String reverseWords(String k) {
    String s=k.trim();
    String sh[]=s.split(" ");
    String h="";
    for(int i=sh.length-1;i>=0;i--)
    {
    if(i!=0)
    {
     h+=sh[i]+" ";
    }
    else
    h+=sh[i];
    }
    return h;
    }
}