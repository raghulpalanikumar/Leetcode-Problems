class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        boolean bool[] = new boolean[nums.length];
        callback(nums,new ArrayList<>(),l,bool);
        return l;
    }
    void callback(int nums[],List<Integer> k,List<List<Integer>> l,boolean bool[])
    {
        if(k.size()==nums.length)
        {
        l.add(new ArrayList<>(k));
        return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(bool[i])
            {
                continue;
            }
            bool[i]=true;
            k.add(nums[i]);
            callback(nums,k,l,bool);
            k.remove(k.size()-1);
            bool[i]=false;
        }
    } 
}