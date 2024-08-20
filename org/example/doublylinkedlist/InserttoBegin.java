package org.example.doublylinkedlist;

public class InserttoBegin {
    public static void main(String[] args) {
        Node n1=new Node(10);
        System.out.println("Before Adding:");
        printlist(n1);
        n1=addNew(n1,20);
        n1=addNew(n1,30);
        n1=addNew(n1,40);
        System.out.println("After Adding:");

        printlist(n1);
    }


    public static Node addNew(Node head, int value){
        Node temp= new Node(value);
        temp.next=head;
        if(head!=null){
            head.prev=temp;

        }


        return temp;
    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
