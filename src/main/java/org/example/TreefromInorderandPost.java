package org.example;

import com.sun.source.tree.Tree;

import java.util.HashMap;

public class TreefromInorderandPost {
    public static void main(String[] args) {
        int inorder[]={4, 2, 5, 1, 3};
        int postorder[]={4, 5, 2, 3, 1};

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder==  null || postorder== null || inorder.length!=postorder.length){
            return null;

        }
        HashMap<Integer, Integer> hashmap=new HashMap<>();
        for (int i = 0; i <inorder.length ; i++) {
            hashmap.put(inorder[i],i);

        }
        return buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,hashmap);

    }
//is->inoderStart
//    ie->inoderend
    private TreeNode buildTree(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, HashMap<Integer, Integer> hashmap) {

if(ps>pe || is>ie) return null;
TreeNode root=new TreeNode((postorder[pe]));

int inRoot=hashmap.get(postorder[pe]);
int numsLeft=inRoot-is;
root.left= buildTree(inorder,is,inRoot-1, postorder,ps,ps+numsLeft-1,hashmap);
root.right=buildTree(inorder,inRoot+1, ie,postorder, ps+numsLeft,pe-1,hashmap);

return root;
    }
}

