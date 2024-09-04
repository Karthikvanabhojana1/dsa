package org.example.leetcode;

import org.example.circular.singular.Node;

public class DeleteNthNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);

         head= remove(head,2);
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
    public static ListNode remove(ListNode head, int n) {

        if(head==null)return head;

        if(n==1){
            if (head == null) return head;
            if (head.next == null) return null;
            head.val=head.next.val;
            head.next=head.next.next;
        }
        ListNode curr=head;
        for (int i = 0; i < n-2; i++) {
curr=curr.next;
        }
        curr.next=curr.next.next;
return head;
    }
}
