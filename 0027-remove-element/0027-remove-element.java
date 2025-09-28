class Solution {
    public int removeElement(int[] nums, int val) {
        int id = 0; // position to place next valid element
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[id++] = nums[i]; // overwrite elements in-place
            }
        }
        
        return id; // new length of array without 'val'
    }
}
