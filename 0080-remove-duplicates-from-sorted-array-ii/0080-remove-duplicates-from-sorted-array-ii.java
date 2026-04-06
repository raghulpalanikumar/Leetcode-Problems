class Solution {
   public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>(); // TreeMap keeps numbers sorted
        int index = 0;

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int num : map.keySet()) {
            int freq = Math.min(map.get(num), 2); // keep max 2 copies
            for (int i = 0; i < freq; i++)
                nums[index++] = num;
        }
        return index;
    }

}