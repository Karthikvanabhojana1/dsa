package linkedlist;

public class BasicsLinkedList {
    public static void main(String[] args) {
        Node n1=new Node(2);
        Node n2=new Node(3);
        Node n3=new Node(5);

        n1.next=n2;
        n2.next=n3;

        System.out.println(n1.next);
        System.out.println(n2);
        System.out.println(n1.next.next);
        System.out.println(n3);




    }

}

