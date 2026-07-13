class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> ans = new ArrayList<>();

        // Base string containing all sequential digits
        String digits = "123456789";

        // Number of digits in low and high
        int lowLength = String.valueOf(low).length();
        int highLength = String.valueOf(high).length();

        // Generate numbers of every possible length
        for (int len = lowLength; len <= highLength; len++) {

            // Generate all sequential numbers of this length
            for (int i = 0; i + len <= 9; i++) {

                // Take a substring and convert it to an integer
                int num = Integer.parseInt(digits.substring(i, i + len));

                // Add only if it lies within the range
                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }

        return ans;
    }
}