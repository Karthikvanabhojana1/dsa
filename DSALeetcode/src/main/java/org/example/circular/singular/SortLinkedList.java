package org.example.circular.singular;

public class SortLinkedList {
    public static void printlist(Node head) {
    Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node node=new Node(37);
        System.out.println("Before");
        printlist(node);
        node= insertsort(node,90);
        node= insertsort(node,30);
        node= insertsort(node,10);
        System.out.println("After adding");

        printlist(node);
    }

    private static Node insertsort(Node head, int i) {
        Node temp=new Node(i);

        if(head==null ) return temp;
        if(temp.data<head.data){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        while (curr.next!=null && curr.next.data<=i) {
            curr=curr.next;
        }

        temp.next=curr.next;
        curr.next=temp;
        return head;

    }
}
