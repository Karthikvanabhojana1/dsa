package leetcode;

public class DeleteDDLwithKey {
    public static DNode deleteAllOccurOfX(DNode head, int x) {
        // Write your code here
        DNode temp = head;
        while (temp != null) {
            if (temp.data == x) {
                if(temp.prev==null){
                    head=temp.next;
                    if(head!=null) {
                        head.prev=null;
                    }

                }else {
                    temp.prev.next = temp.next;
                    if (temp.next != null)
                        temp.next.prev = temp.prev;
                }
            }
            temp = temp.next;

            }

        return head;
    }

    public static void main(String[] args) {

        DNode head = new DNode(10);
        DNode node2 = new DNode(20);
        DNode node3 = new DNode(30);
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

        int key = 20;

        // Call the delete function
        head = deleteAllOccurOfX(head, key);

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
class DNode
{
    int data;
    DNode next;
    DNode prev;
    DNode(int data)
    {
        this.data = data;
        next = prev = null;
    }
}