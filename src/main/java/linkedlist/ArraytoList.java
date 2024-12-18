package linkedlist;

public class ArraytoList {
    static Node constructLL(int arr[]) {
        // code here
        Node head =new Node();
        Node current=head;
        for(int i=0;i<arr.length;i++){
            Node newnode =new Node(arr[i]);
            current.next=newnode;
            current=current.next;

        }
        return head.next;
    }
}
