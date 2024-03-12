package org.example.circular.doubly;


public class Insersion {
    public static void main(String[] args) {
Node head=new Node(10);
head.next=head;
head.prev=head;
head =insert(head,89);
print(head);
    }

    private static Node insert(Node head, int value) {

        Node temp=new Node(value);
        if (head==null) {
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return temp;
    }
    static  void print(Node head){
        if(head==null) return;
        System.out.print(" "+head.data);

        for (Node i = head.next; i!=head  ; i=i.next) {
            System.out.print(" "+i.data);

        }
        System.out.println();
    }
//can also use dowhile



}
