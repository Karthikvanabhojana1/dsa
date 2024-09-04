package org.example.searchlist;

public class Sumofrev {
    public static void main(String[] args) {
//        ListNode head1=new ListNode(2);
//        head1.next=new ListNode(4);
//        head1.next.next=new ListNode(9);
//        ListNode head2=new ListNode(5);
//        head2.next=new ListNode(6);
//        head2.next.next=new ListNode(4);
//        head2.next.next.next=new ListNode(9);
//
        ListNode head1 = new ListNode(9);

        // Create the second linked list: 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 1
        ListNode head2 = new ListNode(9);
        head2.next = new ListNode(9);
        head2.next.next = new ListNode(9);
        head2.next.next.next = new ListNode(9);
        head2.next.next.next.next = new ListNode(9);
        head2.next.next.next.next.next = new ListNode(9);
        head2.next.next.next.next.next.next = new ListNode(9);
        head2.next.next.next.next.next.next.next = new ListNode(9);
        head2.next.next.next.next.next.next.next.next = new ListNode(9);
        head2.next.next.next.next.next.next.next.next.next = new ListNode(1);

        ListNode res=addTwoNumbers(head1,head2);
        printlist(res);

    }
    public static void printlist(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;   //if node is null use zero else use the val
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry; // add individual values in respective position
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }
}
