class Solution {
    public char kthCharacter(long k, int[] operations) {

        int shift = 0;

        for (int i = operations.length - 1; i >= 0; i--) {

            long len = 1L << Math.min(i, 60);   // prevent overflow

            if (k > len) {
                k -= len;

                if (operations[i] == 1) {
                    shift++;
                }
            }
        }

        return (char)('a' + (shift % 26));
    }
}