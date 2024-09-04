package org.example.exception;

public class QueueIsFullException extends Throwable {
    public  QueueIsFullException(){
        super("Queue is Full");

    }
}
