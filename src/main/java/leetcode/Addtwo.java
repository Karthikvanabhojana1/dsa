package leetcode;

import static leetcode.ReverseList206.reverseList;

public class Addtwo {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode l1rev= l1;
            ListNode l2rev= l2;
            ListNode result=new ListNode(0);
            ListNode resultrev=result;
            int carry=0;
            while (l1rev!=null && l2rev!=null) {
                int value=l1rev.val+l2rev.val+carry;
                result.next=new ListNode(value%10);
                result=result.next;
                carry=value/10;
                l1rev=l1rev.next;
                l2rev=l2rev.next;
            }
            while (l1rev!=null) {
                int value=l1rev.val+carry;
                result.next=new ListNode(value%10);
                result=result.next;
                carry=value/10;
                l1rev=l1rev.next;

            }
            while (l2rev!=null) {
                int value=l2rev.val+carry;
                result.next=new ListNode(value%10);
                result=result.next;

                carry=value/10;
                l2rev=l2rev.next;
            }
            if (carry!=0){
                result.next=new ListNode(carry);
                result=result.next;
            }
            return resultrev.next;


    }

}
