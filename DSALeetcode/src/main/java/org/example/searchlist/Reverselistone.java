package org.example.searchlist;

public class Reverselistone {
    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printlist(head);
        head = rev(head);
        printlist(head);
    }
    public static  Node rev(Node head){
       Node curr=head;
       Node prev=null;
       while (curr!=null){
           Node next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }

       return prev;
    }
    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}
