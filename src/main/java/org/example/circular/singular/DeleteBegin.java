package org.example.circular.singular;

public class DeleteBegin {
    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        head = insertEnd(head, 15);
        printlist(head);
        head=delete(head);
        System.out.println("After deleting ");
        printlist(head);

    }

    public static void printlist(Node head) {
        if (head == null) return;
        Node r = head;
        do {
            System.out.print(r.data + " ");
            r = r.next;
        } while (r != head);
    }

    static Node insertEnd(Node head, int x) {

        // add to the begining and change head to head.next
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        } else {
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
            return temp;
        }
    }
    public static Node delete(Node head){
        if (head == null) return null;
        if (head.next == head) return null;
        head.data=head.next.data;
        head.next=head.next.next;



        return head;
    }
}
