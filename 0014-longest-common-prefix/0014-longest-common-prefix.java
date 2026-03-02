class Solution {
    public String longestCommonPrefix(String[] strs) {
    String s1 = strs[0];
    for(int i=1;i<strs.length;i++)
    {
        int j=0;
        StringBuilder s = new StringBuilder();
        while(j<s1.length() && j<strs[i].length())
        {
            if(s1.charAt(j)==strs[i].charAt(j))
            {
            s.append(s1.charAt(j));
            j++;
            }
            else
            {
                break;
            }
        }
        s1=s.toString();
    }
    return s1;
    }
}