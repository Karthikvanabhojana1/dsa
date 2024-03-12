package org.example.searchlist;


public class SearchList {

    public static void main(String args[]) {
    Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printlist(head);
        int loc = search(head,20);
        System.out.println("location" +loc);
    }
    public static  int search(Node head,int key){
        if(head==null) return -1;
        int loc=1;
        Node curr=head;
        do {
if(curr.data==key){
    return loc;
}
            curr=curr.next;

            loc++;
        }while (curr.next!=null);

        return -1;

    }
    public static void printlist(Node head) {
       Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}
