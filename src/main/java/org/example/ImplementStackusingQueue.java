package org.example;

import org.example.queue.from.list.QueueImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueue {
    Queue<Integer>  q1=null;
        Queue<Integer> q2=null;
        int top=0;
        public ImplementStackusingQueue() {
            q1=new LinkedList<>();
          q2=new LinkedList<>();

        }

        public void push(int x) {
q1.add(x);
top=x;
        }

        public int pop() {
return q1.remove();
        }

        public int top() {
return top;        }

        public boolean empty() {
return q1.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

