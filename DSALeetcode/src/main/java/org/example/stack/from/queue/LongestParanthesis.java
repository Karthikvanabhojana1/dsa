package org.example.stack.from.queue;

import java.util.Stack;

public class LongestParanthesis {
    public static void main(String[] args) {
    String str="()(()";
    int longestValidParentheses=longestValidParentheses(str);
        System.out.println(longestValidParentheses);
    }
    public static int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        // Initialize maximum length to 0
        int maxLength = 0;

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            // Get the current character
            char ch = s.charAt(i);

            if (ch == '(') {
                // Push the index of the opening parenthesis onto the stack
                stack.push(i);
            } else if (ch == ')') {
                // Pop the top index from the stack
                stack.pop();

                if (stack.isEmpty()) {
                    // If the stack is empty, push the current index as a new base
                    stack.push(i);
                } else {
                    // Calculate the length of the current valid parentheses substring
                    int currentLength = i - stack.peek();
                    // Update the maximum length if necessary
                    maxLength = Math.max(maxLength, currentLength);
                }
            }
        }

        // Return the maximum length found
        return maxLength;
            }


}