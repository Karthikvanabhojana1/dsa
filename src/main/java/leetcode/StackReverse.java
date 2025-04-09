package leetcode;

import java.util.Stack;

public class StackReverse {
    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()){
            return;
        }
        int temp=s.pop();
        reverse(s);
        insert(s,temp);

    }
    private static void insert(Stack<Integer> s,int temp){
        if(s.isEmpty()){
            s.push(temp);
            return;
        }
        int top=s.pop();
        insert(s,temp);
        s.push(top);
    }
}
