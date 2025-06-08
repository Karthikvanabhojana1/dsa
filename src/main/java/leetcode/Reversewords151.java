package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Reversewords151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
    public static String reverseWords(String s) {
//            String[] words = s.trim().split("\\s+"); // Trim and split by one or more spaces
//            Stack<String> stack = new Stack<>();
//
//            for (String word : words) {
//                stack.push(word);
//            }
//
//            StringBuilder sb = new StringBuilder();
//            while (!stack.isEmpty()) {
//                sb.append(stack.pop());
//                if (!stack.isEmpty()) {
//                    sb.append(" ");
//                }
//            }
//
//            return sb.toString();

        StringBuilder result=new StringBuilder();
        int i=s.length()-1;
            while (i >= 0) {
                if (s.charAt(i) == ' ') {
                    i--;
                    continue;
                }

                int j = i;
                while (j >= 0 && s.charAt(j) != ' ') {
                    j--;
                }

                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(s.substring(j + 1, i + 1));

                i = j - 1;
            }

            return result.toString();

}
}
