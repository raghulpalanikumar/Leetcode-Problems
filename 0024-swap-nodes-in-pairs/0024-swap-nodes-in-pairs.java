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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head; // no pair to swap

        Stack<ListNode> stack = new Stack<>();
        ListNode dummy = new ListNode(0); // helper node
        ListNode curr = dummy; // to build the new list
        ListNode temp = head;

        while (temp != null) {
            int count = 0;

            // Push up to 2 nodes in stack
            while (temp != null && count < 2) {
                stack.push(temp);
                temp = temp.next;
                count++;
            }

            // Pop from stack (reverse order)
            while (!stack.isEmpty()) {
                curr.next = stack.pop();
                curr = curr.next;
            }
        }

        // Very important: end of list should be null
        curr.next = null;

        return dummy.next;
    }
}
