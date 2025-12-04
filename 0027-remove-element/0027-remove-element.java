class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; // points to the next position to place a valid element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index; // return number of elements not equal to val
    }
}
