package org.example.doublylinkedlist;

public class InsertToEnd {
    public static void main(String[] args) {
        Node n1=new Node(10);
        System.out.println("Before Adding:");
        printlist(n1);
        n1=addNewend(n1,20);
        n1=addNewend(n1,30);
        n1=addNewend(n1,40);
        System.out.println("After Adding(end) :");

        printlist(n1);
    }


    public static Node addNewend(Node head, int value){
        Node temp= new Node(value);
        if(head==null) return temp;
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
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
