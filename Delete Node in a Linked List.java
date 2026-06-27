/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val; //assign the next node vlaue in the currrent node
        node.next = node.next.next; // skip the next node beacause in next node we assign the the value of the nextnode next value
    }
}