package org.example.circular.singular;

public class CreateCircular {
    public static void main(String[] args) {
        Node node=new Node(37);
        Node node2=new Node(58);
        Node node3=new Node(57);
        node.next=node2;
        node2.next=node3;
        node3.next=node;
        print(node);

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
