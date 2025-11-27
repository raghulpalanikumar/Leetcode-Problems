class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null) {
            // Check if current node has duplicates
            if (head.next != null && head.val == head.next.val) {
                int dupVal = head.val;

                // Skip all nodes having the same value
                while (head != null && head.val == dupVal) {
                    head = head.next;
                }

                // Connect previous unique node to next distinct node
                prev.next = head;
            } else {
                // Move both prev and head forward if current node is unique
                prev = head;
                head = head.next;
            }
        }

        return dummy.next;
    }
}
