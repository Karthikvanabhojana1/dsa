package leetcode;

public class CyclicLinkedList141 {
    public boolean hasCycle(ListNode head) {
        if( head==null){
            return false;
        }
        if(head.next==null ){
            return false;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow) {
                return true;
            }
        }
        return false;

    }
}
 class ListNode {
     int val;
    ListNode next;
  ListNode(int x) {
        val = x;
        next = null;
    }
  }