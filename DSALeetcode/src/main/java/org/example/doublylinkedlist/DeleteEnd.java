package org.example.doublylinkedlist;

public class DeleteEnd {
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        n1.next=n2;
        n2.prev=n1;
        n2.next=n3;
        n3.prev=n2;
        printlist(n1);
        n1=deleteend(n1);
        System.out.println("After Deleting end");
        printlist(n1);
    }



    public static Node deleteend(Node head){
        if(head ==null) return null;
        if(head.next==null) return null;
        Node curr=head;

        while ((curr.next.next!=null)){
            curr =curr.next;

        }
        curr.next=null;
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
