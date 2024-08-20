package org.example;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
String path ="/../";
        System.out.println(simplifyPath(path));

    }
    public static String simplifyPath(String path) {
         StringBuilder sb = new StringBuilder();
         Stack<String> stack = new Stack<>();

        for(int i = 0; i < path.length() + 1; ++i) {
            if((i == path.length() || path.charAt(i) == '/') && sb.length() > 0) {
                 String directory = sb.toString();

                if(directory.equals("..") && !stack.isEmpty())
                    stack.pop();
                else if(!directory.equals("..") && !directory.equals("."))
                    stack.push(directory.toString());

                sb.setLength(0);
            } else if(i < path.length() && path.charAt(i) != '/') {
                sb.append(path.charAt(i));
            }
        }

        String result = "";

        while(!stack.isEmpty())
            result = "/" + stack.pop() + result;

        return result.length() == 0 ? "/" : result;
        }

}
