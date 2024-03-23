package org.example.tree;

public class PrintNodeatK {
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
        printk(rootNode,2);

        // Printing inorder traversal
    }

    public static void printk(Node root, int k){
if(root==null) return ;
if(k==0) System.out.println(root.key+" ");
else {
    printk(root.left, k-1);
    printk(root.right, k-1);

}
    }
}
