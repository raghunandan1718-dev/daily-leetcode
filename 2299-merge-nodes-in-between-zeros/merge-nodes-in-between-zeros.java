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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        ListNode numsNode = head.next;

        while(numsNode != null){

            int sum = 0;
            while(numsNode.val != 0){
                sum = sum + numsNode.val;
                numsNode = numsNode.next;
            }

            temp.val = sum;
            temp.next = numsNode.next;
            
            temp = temp.next;
            numsNode = numsNode.next;


        }
     return head;
        
    }
}