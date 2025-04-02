package leetcode;

public class IntersectionOFLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=tempB) {
            if(tempA==null){
                tempA=headB;
            }
            else{
                tempA=tempA.next;
            }
            if(tempB==null){
                tempB=headA;
            }
            else{
                tempB=tempB.next;
            }
        }
        return tempA;
    }
}
