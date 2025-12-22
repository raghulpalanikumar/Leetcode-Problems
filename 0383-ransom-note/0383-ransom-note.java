class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();

        Arrays.sort(r);
        Arrays.sort(m);

        return new String(m).contains(new String(r));
    }
}
