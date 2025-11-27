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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        Stack<ListNode> stack = new Stack<>();
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            // Step 1: Push k nodes into stack
            int count = 0;
            ListNode temp = curr;
            while (temp != null && count < k) {
                stack.push(temp);
                temp = temp.next;
                count++;
            }

            // Step 2: If fewer than k nodes remain → stop (don’t reverse)
            if (count < k) {
                prev.next = curr;
                break;
            }

            // Step 3: Pop k nodes to reverse the group
            while (!stack.isEmpty()) {
                prev.next = stack.pop(); // link reversed nodes
                prev = prev.next;        // move prev forward
            }

            // Step 4: Connect last node of reversed part to the rest
            prev.next = temp;
            curr = temp; // move to next group
        }

        return dummy.next;
    }
}
