package org.example.stack.from.queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementation {

    static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<Integer>();


    static int curr_size;

    StackImplementation()
    {
        curr_size = 0;
    }

    static void push(int x)
    {
        curr_size++;


        q2.add(x);


        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }

//new value is entered to the 1st position so that pop will remove the recent input
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    static void pop()
    {


        if (q1.isEmpty())
            return;
        q1.remove();
        curr_size--;
    }

    static int top()
    {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    static int size()
    {
        return curr_size;
    }

}
