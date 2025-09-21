class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        int left=0;
        int right=0;
        Deque<Integer> q = new LinkedList<>();
        for(right=0;right<nums.length;right++)
        {
        while(!q.isEmpty() && nums[q.peekLast()]<nums[right])
        {
            q.pollLast();
        }
        q.offerLast(right);
        if(!q.isEmpty() && q.peekFirst()<left)
        {
            q.pollFirst();
        }
        if(right-left+1==k)
        {
            a.add(nums[q.peekFirst()]);
            left++;
        }
        }
        int arr[] = new int[a.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=a.get(i);
        }
        return arr;
    }
}