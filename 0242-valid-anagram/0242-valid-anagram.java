class Solution {
    public boolean isAnagram(String s, String t) {
    Map<Character,Integer> m = new HashMap<>();
    Map<Character,Integer> m1 = new HashMap<>();
    if(s.length()!=t.length())
    {
        return false;
    }
    for(int i=0;i<s.length();i++)
    {
        m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        m1.put(t.charAt(i),m1.getOrDefault(t.charAt(i),0)+1);
    }
   
    return m.equals(m1);
}
}