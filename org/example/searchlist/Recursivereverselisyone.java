package org.example.searchlist;

public class Recursivereverselisyone {
    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printlist(head);
        head = rev(head);
        printlist(head);
    }
    public static  Node rev(Node head){
       if(head==null) return null;
       if(head.next==null) return head;


       Node rest_head=rev(head.next); //30->node
       Node rest_tail=head.next; // null , 20->node
       rest_tail.next=head;//30 node -null;
       head.next=null; //
       return rest_head; //30->node


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
