package org.example.tree;

public class SymmetricTree {
    public boolean isSymmetric(Node root) {

if(root==null){

return false;
    }
return isMirror(root.left,root.right);
}

    private boolean isMirror(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }
        // If one node is null and the other is not, they are asymmetric
        if (left == null || right == null) {
            return false;
        }
        if(left.key==right.key){
           return  isMirror(left.left,right.left) && isMirror(left.right,right.right);

        }
        else {
            return false;
        }

    }
}