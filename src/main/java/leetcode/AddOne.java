package leetcode;

public class AddOne {
    public Node addOne(Node head) {
        // code here.
        Node revHead=reverseList(head);
        Node temp=revHead;
        int carry=0;
        while(temp!=null){
            if(temp.data==9){
                temp.data=0;
                carry=1;
            }
            else {
                temp.data+=1;
                break;
            }
            if(temp.next==null){
                if(carry==1){
                    temp.next=new Node(1);
                    break;
                }
            }
            temp=temp.next;
        }
        head=reverseList(revHead);

        return head;
    }
    public static Node reverseList(Node head) {
        if( head==null) return head;
        if(head.next==null) return head;
        Node curr=head;
        Node previous=null;
        while(curr!=null){
            Node front= curr.next;
            curr.next=previous;
            previous=curr;
            curr=front;
        }
        return previous;

    }
}
