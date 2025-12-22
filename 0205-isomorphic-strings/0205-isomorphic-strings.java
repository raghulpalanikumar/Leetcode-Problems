class Solution {
    public boolean isIsomorphic(String s, String t) {
       Map<Character,Character> s1 = new HashMap<>();
       Map<Character,Character> s2 = new HashMap<>();
       if(s.length()!=t.length())
       {
        return false;
       } 
       for(int i=0;i<s.length();i++)
       {
        char g=s.charAt(i);
        char h=t.charAt(i);
        if(s1.containsKey(g) && s1.get(g)!=h)
        {
            return false;
        }
        if(s2.containsKey(h) && s2.get(h)!=g)
        {
            return false;
        }
        s1.put(g,h);
        s2.put(h,g);
       }
       return true;
    }
}