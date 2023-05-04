package Algorithms;

// LeetCode 83.

// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

public class RemoveDuplicatesFromLinkedList {

    public ListNode solution(ListNode head) {
        ListNode current = head;

        while (current != null) {
            while (current.next != null && current.next.val == current.val) {
                current.next = current.next.next;
            }
            current = current.next;
        }

        return head;
    }
    // Time: O(n)
    // Memory: O(1)
}

