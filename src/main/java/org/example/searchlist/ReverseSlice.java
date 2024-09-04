package org.example.searchlist;

public class ReverseSlice {
    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(89);
        head.next.next.next.next = new Node(73);

        printlist(head);
        head = rev(head,3);
        printlist(head);
    }
    public static  Node rev(Node head,int key){
        Node curr=head,prevFirst=null;
        boolean isFirstPass=true;
        while(curr!=null){
            Node first=curr,prev=null;
            int count=0;
            while(curr!=null&&count<key){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                count++;
            }
            if(isFirstPass){head=prev;isFirstPass=false;}
            else{prevFirst.next=prev;}
            prevFirst=first;
        }
        return head;
    }
    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

//    public ListNode reverseKGroup(ListNode head, int k) {
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode prev = dummy;
//
//        while (prev != null) {
//            prev = reverseNextK(prev, k);
//        }
//
//        return dummy.next;
//    }

    // Reverse the next K nodes starting from the node after prev
//    private ListNode reverseNextK(ListNode prev, int k) {
//        ListNode last = prev;
//        for (int i = 0; i < k + 1; i++) {
//            last = last.next;
//            if (i != k && last == null) // If the remaining nodes are less than k, no need to reverse
//                return null;
//        }
//
//        ListNode tail = prev.next;
//        ListNode curr = prev.next.next;
//
//        while (curr != last) {
//            ListNode nextTemp = curr.next;
//            curr.next = prev.next;
//            prev.next = curr;
//            tail.next = nextTemp;
//            curr = nextTemp;
//        }
//
//        return tail; // Return the new prev for the next iteration
//    }

}
