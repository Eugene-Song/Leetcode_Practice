203. Remove Linked List Elements
        Remove all elements from a linked list of integers that have value val.

        Example:

        Input:  1->2->6->3->4->5->6, val = 6
        Output: 1->2->3->4->5


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// 直接iterate 有一样的就删掉
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode prev = sentinel, curr = head;

        while(curr != null){
            if (curr.val == val){
                prev.next = curr.next;

            }
            else {
                prev = curr;
            }
            curr = curr.next;
        }
        return sentinel.next;

    }
}