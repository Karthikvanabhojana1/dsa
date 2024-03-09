package org.example.queue.from.list;

public class QueueImplementation {

    Node front,rear;
    QueueImplementation(){
        front=rear=null;

    }
    void enqueue(int item){
        Node temp=new Node(item);
        if(front==null){
            front=rear=temp;
            return;

        }
        rear.next=temp; //link the previous rear to new node
        rear=temp; //and then assign the new added temp to rear
    }
    void dequeue(){
        if(front==null) {
            return ;
        }

        this.front = this.front.next; //assign the current front to the referent of next node
            if (this.front == null)
                this.rear = null;
    }
}
