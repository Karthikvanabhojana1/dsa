package org.example.searchlist;

import java.util.List;

public class SortList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev = dummy;
        ListNode current=head;


        while (current!=null){
            if (current.next != null && current.next.val < current.val) {
                // Locate the insertion point
                while (prev.next != null && prev.next.val < current.next.val) {
                    prev = prev.next;
                }
                // Remove the node to be inserted
                ListNode temp = current.next;
                current.next = current.next.next;

                // Insert the node at the correct position
                temp.next = prev.next;
                prev.next = temp;

                // Reset prev to dummy node
                prev = dummy;
            } else {
                current = current.next;
            }
        }

return dummy.next;
    }
}
