package Algorithms;

// LeetCode 203.
// Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

public class RemoveLinkedListElements {

    public ListNode solution(ListNode head, int val) {

        // If head is null, return null
        if (head == null) {
            return null;
        }

        // If the head value matches val, move head to the next node
        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        ListNode current = head;

        while (current.next != null) {

            if (current.val == val) {
                current = current.next;
            } else if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
