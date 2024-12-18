package linkedlist;

public class CountNode {
    public int getCount(Node head) {
        // code here
        Node curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;

    }

}
