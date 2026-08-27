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
    public ListNode partition(ListNode head, int x) {

        ListNode lessDummy = new ListNode(-1);
        ListNode moreDummy  = new ListNode(-1);

        ListNode less = lessDummy;
        ListNode more = moreDummy;

        while( head!= null ){
            if(head.val < x){
                less.next = head;
                less = less.next;
            }else{
                more.next = head;
                more = more.next;
            }
            head = head.next;
        }

        more.next = null;

        less.next = moreDummy.next;
        
        return lessDummy.next;
    }
}