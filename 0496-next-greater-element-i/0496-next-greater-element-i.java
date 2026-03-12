class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<nums2.length;i++)
        {
            while(!s.isEmpty() && s.peek()<nums2[i])
            {
             m.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }
        while(!s.isEmpty())
        {
            m.put(s.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=m.get(nums1[i]);
        }
        return nums1;
    }
}