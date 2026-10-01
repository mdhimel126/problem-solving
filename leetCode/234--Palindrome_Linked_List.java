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
    public boolean isPalindrome(ListNode head) {

        ListNode first=head;
        ListNode second=first.next;
        ListNode initial=null;

        ListNode temp=head;

        while(second != null && second.next!=null){

            first=first.next;
            second=second.next.next;
        }
        first=first.next;

        while(first!=null){
            ListNode advance=first.next;
            first.next=initial;
            initial=first;
            first=advance;
        }

        while(initial!=null){
            if(temp.val != initial.val){
                return false;
            }
            temp=temp.next;
            initial=initial.next;
        }
        return true;
        
    }
}