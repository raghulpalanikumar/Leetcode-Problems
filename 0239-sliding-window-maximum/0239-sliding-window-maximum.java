import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Deque<Integer> q = new LinkedList<>(); // store indices
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Remove elements smaller than current from the back
            while (!q.isEmpty() && nums[q.peekLast()] <= nums[i]) {
                q.pollLast();
            }

            // Remove elements out of the current window from the front
            if (!q.isEmpty() && q.peekFirst() == i - k) {
                q.pollFirst();
            }

            // Add current index
            q.offerLast(i);

            // Add to result if window is complete
            if (i >= k - 1) {
                res.add(nums[q.peekFirst()]);
            }
        }

        // Convert List<Integer> to int[]
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }

    // Test the function
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(sol.maxSlidingWindow(nums, k)));
        // Output: [3, 3, 5, 5, 6, 7]
    }
}
