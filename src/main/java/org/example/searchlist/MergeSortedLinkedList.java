package org.example.searchlist;


public class MergeSortedLinkedList {
    public static void main(String[] args) {
        ListNode head1=new ListNode(2);
        head1.next=new ListNode(4);
        head1.next.next=new ListNode(9);
        ListNode head2=new ListNode(5);
        head2.next=new ListNode(6);
        head2.next.next=new ListNode(9);


        printlist(sort(head1,head2));
    }
    public static void printlist(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    private static ListNode sort(ListNode head1, ListNode head2) {
        if(head1==null) {

            return head2;
        }
        if(head2==null)return head1;
        ListNode head=null,tail=null;
        if(head1.val<=head2.val){
            head=tail=head1;head1=head1.next;
        }
        else{
            head=tail=head2;head2=head2.next;
        }
        while(head1!=null&&head2!=null){
            if(head1.val<=head2.val){
                tail.next=head1;tail=head1;head1=head1.next;
            }
            else{
                tail.next=head2;tail=head2;head2=head2.next;
            }
        }
        if(head1==null){tail.next=head2;}
        else{
            tail.next=head1;
        }
        return head;


    }

}
