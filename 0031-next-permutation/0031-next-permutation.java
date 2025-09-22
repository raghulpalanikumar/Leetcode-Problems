class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int swap1 = -1;

        // Step 1: find pivot
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                swap1 = i;
                break;
            }
        }

        if (swap1 != -1) {
            // Step 2: find element just larger than nums[swap1]
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[swap1]) {
                    swap(nums, i, swap1);
                    break;
                }
            }
        }

        // Step 3: reverse suffix (whole array if swap1 = -1)
        reverse(nums, swap1 + 1);
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int i) {
        int left = i, right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
