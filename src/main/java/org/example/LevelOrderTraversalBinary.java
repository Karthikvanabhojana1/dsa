package org.example;

import java.util.*;

public class LevelOrderTraversalBinary {

    public List<List<Integer>> levelOrder(TreeNode root) {
            // Result list to store each level's values
            List<List<Integer>> result = new ArrayList<>();
            // Check if the root is null; if so, return an empty list
            if (root == null) {
                return result;
            }

            // Queue to perform breadth-first search
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
        Stack<Integer> stack=new Stack<>()    ;
        stack.isEmpty();
        while (!queue.isEmpty()) {
                // List to store values of nodes at the current level
                List<Integer> currentLevel = new ArrayList<>();
                int levelSize = queue.size();

                // Process all nodes at the current level
                for (int i = 0; i < levelSize; i++) {
                    TreeNode currentNode = queue.poll();
                    // Add the value of the current node to the list
                    currentLevel.add(currentNode.val);

                    // Add the left child if it exists
                    if (currentNode.left != null) {
                        queue.add(currentNode.left);
                    }

                    // Add the right child if it exists
                    if (currentNode.right != null) {
                        queue.add(currentNode.right);
                    }
                }

                // Add the current level's list to the result list
                result.add(currentLevel);

            }

            return result;




    }
}
