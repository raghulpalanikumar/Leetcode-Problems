class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int baseActive = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                baseActive++;
            }
        }

        String t = "1" + s + "1";

        // Store run characters and their lengths
        java.util.List<Character> chars = new java.util.ArrayList<>();
        java.util.List<Integer> lens = new java.util.ArrayList<>();

        int i = 0;
        while (i < t.length()) {
            int j = i;
            while (j < t.length() && t.charAt(j) == t.charAt(i)) {
                j++;
            }

            chars.add(t.charAt(i));
            lens.add(j - i);
            i = j;
        }

        int maxGain = 0;

        // An internal '1' block must have '0' blocks on both sides.
        // Net gain = leftZeroLength + rightZeroLength
        for (int k = 1; k < chars.size() - 1; k++) {
            if (chars.get(k) == '1'
                    && chars.get(k - 1) == '0'
                    && chars.get(k + 1) == '0') {

                int gain = lens.get(k - 1) + lens.get(k + 1);
                maxGain = Math.max(maxGain, gain);
            }
        }

        return baseActive + maxGain;
    }
}