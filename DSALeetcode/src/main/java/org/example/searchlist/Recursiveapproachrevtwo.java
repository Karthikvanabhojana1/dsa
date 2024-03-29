package org.example.searchlist;

public class Recursiveapproachrevtwo {

    /*
first reverse n-1 nodes and then link the nth node at end of it

     */
    public static void main(String args[])
    {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        printlist(head);
        head=recRevL(head,null);
        printlist(head);

    }

    static Node recRevL(Node curr,Node prev){
        if(curr==null)return prev;
        Node next=curr.next;
        curr.next=prev;
        return recRevL(next,curr);
    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }

}
