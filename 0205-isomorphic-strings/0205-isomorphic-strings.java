class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Character> m = new HashMap<>();
        Map<Character,Character> m1 = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char s1=s.charAt(i);
            char s2=t.charAt(i);
            if(m.containsKey(s1) && m.get(s1)!=s2)
            {
                return false;
            }
            if(m1.containsKey(s2)&&m1.get(s2)!=s1)
            {
                return false;
            }
            m.put(s1,s2);
            m1.put(s2,s1);
        }
        return true;
    }
}