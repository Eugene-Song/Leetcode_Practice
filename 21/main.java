21. Merge Two Sorted Lists
        Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

        Example:

        Input: 1->2->4, 1->3->4
        Output: 1->1->2->3->4->4



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
1. recursion
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // recursion
        if (l1 == null){
            return l2;
        }
        else if ( l2 == null){
            return l1;
        }
        else if (l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else{
            l2.next = mergeTwoLists(l1 , l2.next);
            return l2;
        }
    }
}

2. iteration
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    while
    }

}