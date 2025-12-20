class Solution {
    public String longestCommonPrefix(String[] str) {
        if(str==null || str.length==0) return "";
        String prefix=str[0];
        for(int i=1;i<str.length;i++)
        {
            StringBuilder result = new StringBuilder();
            int j=0;
            while(j<prefix.length() && j< str[i].length())
            {
                if(prefix.charAt(j)==str[i].charAt(j))
                {
                    result.append(prefix.charAt(j));
                }
                else
                {
                    break;
                }
                j++;
            }
            prefix=result.toString();
            if(prefix.isEmpty()) return "";

        }
        return prefix;
    }
}