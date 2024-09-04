package org.example.searchlist;

public class Checklooping {
    public static void main(String[] args) {
        Nodei head=new Nodei(15);
        head.next=new Nodei(10);
        head.next.next=new Nodei(12);
        head.next.next.next=new Nodei(20);
//        head.next.next.next.next=head.next;
        if (!checkloop(head))
            System.out.print("Loop found");
        else
            System.out.print("No Loop");
    }


    static boolean checkloop(Nodei head){
Nodei curr=head;
while (curr.next!=null){
    if(curr.isvisited){
        return false;
    }
    else {
curr.isvisited=true;
curr=curr.next;
    }
}
return true;
    }
}
