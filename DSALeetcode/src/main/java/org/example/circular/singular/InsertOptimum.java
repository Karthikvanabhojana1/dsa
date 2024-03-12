package org.example.circular.singular;

public class InsertOptimum {
    static  void print(Node head){
        if(head==null) return;
        System.out.print(" "+head.data);

        for (Node i = head.next; i!=head  ; i=i.next) {
            System.out.print(" "+i.data);

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node node=new Node(37);
        node.next=node;
        System.out.println("Before");
        print(node);
        node= inserthead(node,90);
        System.out.println("After adding");
        print(node);
    }

    private static Node inserthead(Node head, int i) {
        Node temp=new Node(i);
        if(head==null){
            temp.next=temp;
            return temp;
        }

        // add data after head and then swap the data
        else{
            temp.next=head.next;
            head.next=temp;
            int t=head.data;
            head.data=temp.data;
            temp.data=t;
            return head;
        }

}}
