package org.example.searchlist;

import org.w3c.dom.NodeList;

public class Reverseinterval {
    public static void main(String args[]) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(89);
        head.next.next.next.next = new ListNode(73);

        printlist(head);
        head = rev(head,2,4);
        printlist(head);
        System.out.println("Testing keyreverse");
        head =revnode(head,3);
        printlist(head);
    }
    public static  ListNode rev(ListNode head,int low, int high){
        ListNode dummyHead = new ListNode(0);
        dummyHead.next=head;

        ListNode prev = null;
        ListNode prevFirst = dummyHead;
        for (int i = 0; i < low - 1; i++) {
            prevFirst = prevFirst.next;
        }


        ListNode curr = prevFirst.next;
        ListNode first = curr;
        for (int i = low; i <= high; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Update pointers to maintain the list structure
        prevFirst.next = prev;
        first.next = curr;

        return dummyHead.next;
    }
    public static void printlist(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }




    public static  ListNode revnode(ListNode head,int low){
        ListNode dummyHead = new ListNode(0);
        dummyHead.next=head;

        ListNode prev = null;
        ListNode prevFirst = dummyHead;



        ListNode curr = prevFirst.next;
        ListNode first = curr;

        for (int i = 0; i <low; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // Update pointers to maintain the list structure
        prevFirst.next = prev;
        first.next = curr;

        return dummyHead.next;
    }
}


