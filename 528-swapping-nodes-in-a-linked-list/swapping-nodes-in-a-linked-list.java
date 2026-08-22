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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode one = head;

        for(int i = 1; i <= k-1; i++){
            one = one.next;
        }

       ListNode temp = one.next;
       ListNode second = head;

        while(temp != null){
            temp = temp.next;
            second = second.next;
        }

        int tempVal = one.val;
        one.val = second.val;
        second.val = tempVal;

        return head;
        
    }
}