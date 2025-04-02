package leetcode;

public class ReverseList206 {
    public static ListNode reverseList(ListNode head) {
        if( head==null) return head;
        if(head.next==null) return head;
        ListNode curr=head;
        ListNode previous=null;
        while(curr!=null){
            ListNode front= curr.next;
            curr.next=previous;
            previous=curr;
            curr=front;
        }
        return previous;

    }
}
