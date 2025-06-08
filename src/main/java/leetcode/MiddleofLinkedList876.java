package leetcode;

public class MiddleofLinkedList876 {
    public ListNode middleNode(ListNode head) {
        // 2 pointer one move in 1x and other in 2x

        ListNode slowNode=head;
        ListNode fastNode=head;
        while(slowNode.next!=null && fastNode.next!=null && fastNode.next.next!=null){
            slowNode=slowNode.next;
            fastNode=fastNode.next.next;
        }
        if(fastNode.next!=null){
            slowNode=slowNode.next;

        }
        return slowNode;
    }
}
