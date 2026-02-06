class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(list,0,nums);
        return res;
    }

    public void solve(List<Integer> list, int i, int[] nums){
        if(i == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        solve(list, i + 1, nums);
        list.remove(list.size()-1);
        solve(list, i + 1, nums);
        
    }
}