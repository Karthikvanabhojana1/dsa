package leetcode;

public class Sort0s1s2s {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        Node curr=head;
        Node zeros=new Node(0);
        Node ones=new Node(1);
        Node twos=new Node(2);
        Node zeroHead=zeros;
        Node onesHead=ones;
        Node twosHead=twos;
        while(curr!=null){
            if(curr.data==0){
                zeros.next=new Node(0);
                zeros = zeros.next;

            }
            else if(curr.data==1){
                ones.next=new Node(1);
                ones=ones.next;
            }
            else if(curr.data==2){
                twos.next=new Node(2);
                twos=twos.next;
            }
            curr=curr.next;
        }

        if(onesHead.next!=null){
            zeros.next=onesHead.next;

        }
        else{
            zeros.next=twosHead.next;
        }
        ones.next=twosHead.next;
        twos.next=null;
        return zeroHead.next;

    }
}
