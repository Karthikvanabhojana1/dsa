package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class MathOnArray {
    public static void main(String[] args) {
String s[]={"4","13","5","/","+"};
        System.out.println(evalRPN(s));
    }

    public static int evalRPN(String[] tokens) {
int result=0;
        Collections.reverse(Arrays.asList(tokens));

        Stack<String> stack=new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            stack.push(tokens[i]);
        }
int i=stack.size()-1;
        while(stack.size()>0) {
            if(stack.get(i).equals("+")){
                if(stack.size()==tokens.length){
                    result=Integer.parseInt(stack.pop())+Integer.parseInt(stack.pop());
                    stack.pop();
                    i=stack.size()-1;
                }
                else {
                    result+=Integer.parseInt(stack.pop());
                    stack.pop();
                    i=stack.size()-1;


                }


            } else if (stack.get(i).equals("*")) {
                if(stack.size()==tokens.length){
                    result=Integer.parseInt(stack.pop())*Integer.parseInt(stack.pop());
                    stack.pop();
                    i=stack.size()-1;

                }
                else {
                    result*=Integer.parseInt(stack.pop());
                    stack.pop();
                    i=stack.size()-1;



                }
            }
            else if (stack.get(i).equals("-")) {
                if(stack.size()==tokens.length){
                    result=Integer.parseInt(stack.pop())-Integer.parseInt(stack.pop());
                    stack.pop();
                    i=stack.size()-1;

                }
                else {
                    result-=Integer.parseInt(stack.pop());
                    stack.pop();
                    i=stack.size()-1;



                }
            }
            else if (stack.get(i).equals("/")) {
                if(stack.size()==tokens.length){
                    result= Integer.parseInt(stack.pop())/Integer.parseInt(stack.pop());
                    stack.pop();
                    i=stack.size()-1;

                }
                else {
                    result=result / Integer.parseInt(stack.pop());
                    stack.pop();
                    i=stack.size()-1;


                }
            }
            else{
                i--;
            }

        }
        return result;

    }
//    public static int evalRPN(String[] tokens) {
//        Stack<Integer> stack = new Stack<>();
//
//        // Loop through each token in the array
//        for (String token : tokens) {
//            // Check if the token is an operator
//            if (token.equals("+")) {
//                // Pop the top two elements from the stack, add them, and push the result back
//                int operand2 = stack.pop();
//                int operand1 = stack.pop();
//                stack.push(operand1 + operand2);
//            } else if (token.equals("-")) {
//                // Pop the top two elements from the stack, subtract them, and push the result back
//                int operand2 = stack.pop();
//                int operand1 = stack.pop();
//                stack.push(operand1 - operand2);
//            } else if (token.equals("*")) {
//                // Pop the top two elements from the stack, multiply them, and push the result back
//                int operand2 = stack.pop();
//                int operand1 = stack.pop();
//                stack.push(operand1 * operand2);
//            } else if (token.equals("/")) {
//                // Pop the top two elements from the stack, divide them, and push the result back
//                int operand2 = stack.pop();
//                int operand1 = stack.pop();
//                stack.push(operand1 / operand2);
//            } else {
//                // If the token is not an operator, it's an operand, so parse it as an integer and push to the stack
//                stack.push(Integer.parseInt(token));
//            }
//        }
//
//        // At the end, the result will be the only element remaining in the stack
//        return stack.pop();
//    }
}
