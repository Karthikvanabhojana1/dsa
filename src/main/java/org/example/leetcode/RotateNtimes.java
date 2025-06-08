package org.example.leetcode;

import org.example.searchlist.Node;

public class RotateNtimes {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printlist(head);
        printlist(head);
        System.out.println("Testing keyreverse");
        head =rotateRight(head, 2);
        printlist(head);
    }
    public static void printlist(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        // Step 1: Find the length of the linked list
        int length = 1; // Start from 1 to count the head node
        ListNode tail = head;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        // Compute the effective rotation amount
        k = k % length;
        if (k == 0) {
            return head; // No rotation needed
        }

        // Step 2: Link the tail to the head to form a circular list
        tail.next = head;

        // Step 3: Traverse to find the new tail (kth node from the end) and new head
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;

        // Step 4: Break the circular list
        newTail.next = null;

        return newHead;
    }

}
