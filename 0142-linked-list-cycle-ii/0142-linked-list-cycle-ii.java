/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> n = new HashSet<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(n.contains(temp))
            {
                return temp;
            }
            n.add(temp);
            temp=temp.next;
        }
        return null;
    }
}