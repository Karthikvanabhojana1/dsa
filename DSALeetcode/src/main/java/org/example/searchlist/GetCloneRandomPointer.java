package org.example.searchlist;

import java.util.HashMap;

public class GetCloneRandomPointer {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;

        // Assigning random pointers
        node1.random = node3; // node1.random points to node3
        node2.random = node1; // node2.random points to node1
        node3.random = node2; // node3.random points to node2

        // Call the copyRandomList function
        Node copyHead = copyRandomList(node1);

        // Print the result
        printList(copyHead);

    }
    public static Node copyRandomList(Node head) {

        HashMap<Node, Node> map = new HashMap<>();
        for (Node curr = head; curr != null; curr = curr.next) {
            map.put(curr, new Node(curr.data));
        }
        for (Node curr = head; curr != null; curr = curr.next) {
            Node clone = map.get(curr);
            clone.next = map.get(curr.next);
            clone.random = map.get(curr.random);
        }
        return map.get(head);


    }
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.random != null) {
                System.out.print(" (Random: " + curr.random.data + ")");
            }
            System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
