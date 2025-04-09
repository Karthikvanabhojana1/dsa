package leetcode;

import java.util.Stack;

public class CountNestedParanthesis {
    public int maxDepth(String s) {
        int count=0;
        Stack<Character> paranthesis=new Stack<>();

        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='('){
                paranthesis.add('(');
            }
            if(s.charAt(i)==')'){
                if (count<paranthesis.size())
                {
                    count=paranthesis.size();
                }
                paranthesis.pop();

            }
        }
        return count;
    }
}
