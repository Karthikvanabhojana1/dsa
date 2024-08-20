package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class CalculatorfromStringInput {
    public static void main(String[] args) {
        String str="3+2*2";
//        System.out.println(calculate(str));
        System.out.println(removeDuplicateLetters("cbacdcbc"));

    }
    public  static int calculate(String s) {

        Stack<Integer> calculatorinput=new Stack<>();
calculatorinput.peek();
        int num = 0;
        char operator = '+';
for (int i = 0; i < s.length(); i++)
{

    char c = s.charAt(i);
    if (Character.isDigit(c)) {
        num = Integer.parseInt(String.valueOf(c));
    }
    if (isOperator(c) || i == s.length() - 1) {
        if (operator == '+') calculatorinput.push(num);
        else if (operator == '-') calculatorinput.push(-num);
        else if (operator == '*') calculatorinput.push(calculatorinput.pop() * num);
        else if (operator == '/') calculatorinput.push(calculatorinput.pop() / num);

        num = 0;
        operator = c;
    }


        }
int ans= 0;
while (!calculatorinput.isEmpty()) {
            ans += calculatorinput.pop();
        }
return ans;
    }
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    public static String removeDuplicateLetters(String s) {
        StringBuilder sb=new StringBuilder();

        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){

                set.remove(s.charAt(i));
                int j=sb.indexOf(String.valueOf(s.charAt(i)));
                sb.deleteCharAt(j);
            }
            sb.append(s.charAt(i));
            set.add(s.charAt(i));

        }


        return sb.toString() ;
    }



}
