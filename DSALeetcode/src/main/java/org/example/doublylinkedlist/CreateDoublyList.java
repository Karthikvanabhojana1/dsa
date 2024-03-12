package org.example.doublylinkedlist;

public class CreateDoublyList {
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        n1.next=n2;
        n2.prev=n1;
        n2.next=n3;
        n3.prev=n2;
        printlist(n1);
    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }

}

