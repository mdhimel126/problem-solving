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
    public boolean hasCycle(ListNode head) {
        
        ListNode ptr1=head;
        ListNode ptr2=head;

        if(ptr2==null){
            return false;
        }

        while(ptr2.next!=null && ptr2.next.next!=null){
            ptr2=ptr2.next.next;
            ptr1=ptr1.next;

            if(ptr2==ptr1){
                return true;
            }
        }
        return false;
    }
}