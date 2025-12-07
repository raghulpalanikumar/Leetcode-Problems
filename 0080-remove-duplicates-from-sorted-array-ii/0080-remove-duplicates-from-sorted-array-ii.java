class Solution {
   public static int removeDuplicates(int[] nums) {
        // Use TreeMap to keep elements sorted
        Map<Integer, Integer> m = new HashMap<>();
        int index = 0;

        // Step 1: Count frequency of each number
        for (int num : nums) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }

        // Step 2: Place elements back into nums
        for (int num : m.keySet()) {
            int freq = m.get(num);

            // LeetCode 80 rule: keep at most 2 occurrences
            freq = Math.min(freq, 2);

            for (int i = 0; i < freq; i++) {
                nums[index++] = num; // store number (not frequency)
            }
        }

        // Step 3: Return the new length
        return index;
}
}