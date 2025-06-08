package org.example;

import org.example.exception.QueueIsEmptyException;
import org.example.exception.QueueIsFullException;

public class QueueUsingArray {
    int cap,size;
    int[] array;
   public  QueueUsingArray(int c){
       cap=c;
       size=0;
       array=new int[cap];

    }
    void  enqueue(int value) throws QueueIsFullException {
       if(size==cap){
           throw new QueueIsFullException();
       }
       else {
           array[size]=value;
           size++;
           System.out.println(value
                   + " enqueued to queue");

       }

    }
    int dequeue() throws QueueIsEmptyException {
        int temp=array[0];

        if(!isEmpty()){

               for (int i = 0; i < array.length-2; i++) {
                   array[i]=array[i+1];

               }
               size--;
               array[size]= 0;
return temp;
       }
       else {
           throw new QueueIsEmptyException();

       }


    }
    int getFront(){

       return array[0];
    }
    int getRear(){
       return array[size-1];
    }
    boolean isfull(){
       if(size==cap){
           return true;
       }
       else {
           return false;
       }
    }
    boolean isEmpty(){
       if(size==0){
           return true;
       }
       else {
           return false;
       }
    }

    public static void main(String[] args) throws QueueIsFullException, QueueIsEmptyException {
        QueueUsingArray queue = new QueueUsingArray(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue()+
                 " dequeued from queue\n");

        System.out.println("Front item is "
                + queue.getFront());

        System.out.println("Rear item is "
                + queue.getRear());
    }

}
