package leetcode;

import static leetcode.DeleteDDLwithKey.deleteAllOccurOfX;

public class RemoveDuplicatesDLL {
    static  DNode removeDuplicates(DNode head){
        DNode curr=head;
        if(curr.next==null) return curr;
        curr=curr.next;
        while(curr!=null){
            if(curr.data==curr.prev.data){
                curr.prev.next = curr.next;
                if (curr.next != null)
                    curr.next.prev = curr.prev;
            }
else{
                curr = curr.next;

            }
            }


        return head;

    }
    public static void main(String[] args) {

        DNode head = new DNode(10);
        DNode node2 = new DNode(20);
        DNode node3 = new DNode(20);
        DNode node4 = new DNode(20);
        DNode node5 = new DNode(40);

        // Linking the nodes
        head.next = node2;
        node2.prev = head;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node4;
        node4.prev = node3;
        node4.next = node5;
        node5.prev = node4;

//        int key = 20;

        // Call the delete function
        head = removeDuplicates(head);

        // Print the modified DLL
        printList(head);
    }

    public static void printList(DNode head) {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

