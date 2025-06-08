package leetcode;

public class CountLoop {
    public int countNodesinLoop(Node head) {


        Node slow=head;
        Node fast=head;
        int count=0;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow) {
                slow=slow.next;
                count=1;
                while (slow!=fast){
                    slow=slow.next;
                    count++;

                }

                return count;
            }

        }
        // Add your code here.
        return 0;
    }
}
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}