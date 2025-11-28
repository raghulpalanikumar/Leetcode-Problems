import java.util.Stack;

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: Push all nodes into a stack
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
            length++;
        }

        // Step 2: Handle cases where k > length
        k = k % length;
        if (k == 0) return head;

        // Step 3: Pop k nodes (these will move to front)
        ListNode newTail = stack.get(length - k - 1);
        ListNode newHead = newTail.next;
        ListNode lastNode = stack.peek();

        // Step 4: Rearrange connections
        newTail.next = null;
        lastNode.next = head;

        // Step 5: Return new head
        return newHead;
    }
}
