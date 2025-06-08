package org.example.doublylinkedlist;

public class DeleteBegin {
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        n1.next=n2;
        n2.prev=n1;
        n2.next=n3;
        n3.prev=n2;
        printlist(n1);
        n1=deletebegin(n1);
        System.out.println("After Deleting");
        printlist(n1);
    }



    public static Node deletebegin(Node head){
      if(head ==null) return null;
      if(head.next==null) return null;

      head=head.next;
      head.prev=null;

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
