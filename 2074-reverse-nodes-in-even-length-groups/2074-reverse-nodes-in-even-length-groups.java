/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.Stack;
class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        if (head == null || head.next == null) return head;

        Stack<ListNode> stack = new Stack<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        int groupSize = 1;

        while (curr != null) {
            int count = 0;
            // collect group nodes
            while (curr != null && count < groupSize) {
                stack.push(curr);
                curr = curr.next;
                count++;
            }

            // if even length, reverse using stack
            if (count % 2 == 0) {
                while (!stack.isEmpty()) {
                    prev.next = stack.pop();  // pop reverses order
                    prev = prev.next;
                }
            } else {
                // if odd, keep the same order — pop back to preserve order
                Stack<ListNode> temp = new Stack<>();
                while (!stack.isEmpty()) temp.push(stack.pop());
                while (!temp.isEmpty()) {
                    prev.next = temp.pop();
                    prev = prev.next;
                }
            }
            prev.next = curr; // connect to next group
            groupSize++;
        }
        return dummy.next;
    }
}
