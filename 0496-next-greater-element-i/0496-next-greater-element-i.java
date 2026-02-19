class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> a = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<nums2.length;i++)
        {
            while(!s.empty()&&s.peek()<nums2[i])
            {
            a.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }
        while(!s.empty())
        {
            a.put(s.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=a.get(nums1[i]);
        }
      return nums1;
    }
}