package org.example.leetcode;

public class Delete {

    public static void main(String[] args) {
       ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);

        printlist(head);
        printlist(head);
        System.out.println("Testing keyreverse");
        head =deleteDuplicates(head);
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
     public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode dummy1= new ListNode(0);

         dummy.next = head;
         dummy1.next=dummy;
        ListNode curr=dummy1;
        if(curr==null) return null;
        if(curr.next==null) return curr;
        int temp=0;
        boolean init=true;
        if(curr.val== curr.next.val && curr.next.next==null) {
            return null;
        }
        dummy1=dummy1.next;
        while(dummy1.next!=null && dummy1.next.next!=null){
            if(dummy1.next.val==dummy1.next.next.val || (temp==dummy1.next.val)){
                temp=dummy1.next.val;
                dummy1.next=dummy1.next.next.next;

            }
            else{
                dummy1=dummy1.next;
            }

        }

        return curr.next.next;
    }

}
