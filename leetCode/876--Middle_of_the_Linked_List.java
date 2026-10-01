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
class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode first=head;
        ListNode second=first.next;
        ListNode middle=null;

        while(second!=null){
            first=first.next;
            if(second.next!=null && second.next.next!=null){
            second=second.next.next;
            }else{
                second=second.next;
                break;
            }
        }
        middle=first;
        return middle;
    }
}