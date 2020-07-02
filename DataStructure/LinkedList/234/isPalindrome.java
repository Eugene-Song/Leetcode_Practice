234.Palindrome Linked List
        Given a singly linked list, determine if it is a palindrome.

        Example 1:

        Input: 1->2
        Output: false
        Example 2:

        Input: 1->2->2->1
        Output: true
        Follow up:
        Could you do it in O(n) time and O(1) space?
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// use arraylist and two pointer to sovle
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        ListNode curr = head;
        // store all the elements in linkedlist
        while(curr != null){
            vals.add(curr.val);
            curr = curr.next;
        }
        int start = 0;
        int end = vals.size()-1;
        while (start<end){
            if (!vals.get(start).equals(vals.get(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}