package org.example.leetcode;

import java.util.PriorityQueue;

public class NewListSort {
    public  static ListNode mergeKLists(ListNode[] lists) {
        // Check if lists is empty
        if (lists == null || lists.length == 0) {
            return null;
        }

        // Min-heap to keep track of the smallest nodes
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Initialize the heap with the first node from each list
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        // Dummy head node for the merged list
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        // While there are elements in the heap
        while (!minHeap.isEmpty()) {
            // Get the smallest node from the heap
            ListNode smallestNode = minHeap.poll();

            // Append the smallest node to the merged list
            current.next = smallestNode;
            current = current.next;

            // If there is a next node in the list from which the smallest node came, add it to the heap
            if (smallestNode.next != null) {
                minHeap.offer(smallestNode.next);
            }
        }

        // Return the merged list (next to the dummy head)
        return dummyHead.next;
    }
    public static void main(String[] args) {
        // Create sample sorted linked lists
        ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(6));

        // Array of sorted linked lists
        ListNode[] lists = {list1, list2, list3};

        // Create an instance of the Solution class

        // Merge the sorted linked lists
        ListNode mergedList = mergeKLists(lists);

        // Print the merged linked list
    }
}
