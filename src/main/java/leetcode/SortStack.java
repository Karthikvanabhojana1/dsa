package leetcode;

import java.util.Stack;

public class SortStack {
    public Stack<Integer> sort(Stack<Integer> s) {
        if(!s.isEmpty()){
            int x= s.pop();
            sort(s);
            sortedItem(s,x);
        }
        return s;

    }

    private void sortedItem(Stack<Integer> s, int x) {
        if(s.isEmpty() || x>s.peek()){
            s.push(x);
            return;
        }
        int temp=s.pop();
        sortedItem(s,x);
        s.push(temp);
    }
}
