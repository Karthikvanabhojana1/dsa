package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    static Queue<Integer> queue;
    static void reversequeue(){
        Stack<Integer> stack=new Stack<>();

        int i=0,j=0;
        while (!queue.isEmpty()) {
            stack.add(queue.remove());
            i++;

        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
            j++;

        }

    }
    static void Print()
    {
        for(Integer x: queue)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {
        queue = new LinkedList<Integer>();
        queue.add(12);
        queue.add(5);
        queue.add(15);
        queue.add(20);

        reversequeue();
        Print();
    }
}
