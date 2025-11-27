class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        int pos = 1;

        
        while (temp != null) {
            if (pos >= left && pos <= right) {
                stack.push(temp.val);
            }
            temp = temp.next;
            pos++;
        }

        // Step 2: Second pass - replace values by popping from stack (reversed order)
        temp = head;
        pos = 1;
        while (temp != null) {
            if (pos >= left && pos <= right) {
                temp.val = stack.pop();
            }
            temp = temp.next;
            pos++;
        }

        return head;
    }
}
