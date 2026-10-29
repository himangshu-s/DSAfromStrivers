package linkedList;

public class leetcode143 {
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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        ListNode tail = curr;
        curr = head;

        while (curr != tail && curr.next != tail) {
            // Save the node after curr
            ListNode next = curr.next;

            // Find and detach the tail
            ListNode newTail = findNode(head, tail);
            newTail.next = null;

            // Insert tail after curr
            tail.next = next;
            curr.next = tail;

            // Advance pointers
            curr = next;
            tail = newTail;
        }
    }

    public ListNode findNode(ListNode head, ListNode tail) {
        ListNode node = head;

        while (node.next != tail) {
            node = node.next;
        }

        return node;
    }
}
    
}
