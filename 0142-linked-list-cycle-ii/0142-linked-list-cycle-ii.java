import java.util.HashSet;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();

        ListNode current = head;
        while (current != null) {
            // If we have seen this node before, it's the start of the cycle
            if (visited.contains(current)) {
                return current;
            }
            visited.add(current);
            current = current.next;
        }
        return null; // No cycle found
    }
}
