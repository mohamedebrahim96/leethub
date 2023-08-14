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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode tail = res, p1 = l1, p2 = l2;
        while (p1 != null && p2 != null) {
            tail.next = new ListNode(p1.val < p2.val ? p1.val : p2.val);
            tail = tail.next;
            if (p1.val < p2.val) p1 = p1.next;
            else p2 = p2.next;
        }
        tail.next = p1 == null ? p2 : p1;
        return res.next;
    }
}