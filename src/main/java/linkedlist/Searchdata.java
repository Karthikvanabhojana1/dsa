package linkedlist;

public class Searchdata {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node curr=head;
        while(curr!=null){
            if(curr.data==key){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }
}
