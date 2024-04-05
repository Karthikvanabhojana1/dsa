package org.example.tree;

public class ComponentsinTree {
    public static void main(String[] args) {

        Node rootNode =  new Node(5); // Creating root node with key value 5
        Node leftChild =  new Node(3); // Creating left child node with key value 3
        Node rightChild =  new Node(8); // Creating right child node with key value 8
        Node leftGrandChild =  new Node(2); // Creating left grandchild node with key value 2
        Node rightGrandChild =  new Node(4); // Creating right grandchild node with key value 4
        Node rightRightChild =  new Node(10); // Creating another right child node with key value 10

        // Linking nodes
        rootNode.left = leftChild;
        rootNode.right = rightChild;
        leftChild.left = leftGrandChild;
        leftChild.right = rightGrandChild;
        rightChild.right = rightRightChild;
       int length= length(rootNode);
        System.out.println(length);


    }

    private static int length(Node rootNode) {
if(rootNode ==null) return 0;
else {
    return  1+length(rootNode.left)+length((rootNode.right));
}

    }
}
