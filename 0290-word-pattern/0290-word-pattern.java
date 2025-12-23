class Solution {
    public boolean wordPattern(String pattern, String se) { 
        String arr[]=se.split(" ");
        if (pattern.length() != arr.length) {
    return false;
}
        Map<Character,String> m = new HashMap<>();
        Map<String,Character> k = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
        char s = pattern.charAt(i);
        String b = arr[i];
        if(m.containsKey(s) && !m.get(s).equals(b))
        {
            return false;
        }
        if(k.containsKey(b) && !k.get(b).equals(s))
        {
            return false;
        }
        m.put(s,b);
        k.put(b,s);
        }
        return true;
    }
}