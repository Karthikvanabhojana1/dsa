package org.example.doublylinkedlist;

public class ReverseDoubleLinkedList {
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        n1.next=n2;
        n2.prev=n1;
        n2.next=n3;
        n3.prev=n2;
        printlist(n1);
        n1=rev(n1);
        System.out.println("After Rotating");
        printlist(n1);

    }
    public static Node rev(Node head){
        Node curr=head;
        Node temp=null;

        while (curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;

        }

        if(temp!=null)head=temp.prev;
        return head;

    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
    }

