package linkedlist;

public class MyLinkedList {
    int value;
    MyLinkedList next;

    MyLinkedList head;

    public MyLinkedList() {
        head = null;
    }


    public MyLinkedList(int value) {
        this.value = value;
        this.next = null;
    }

    public int get(int index) {
        MyLinkedList curr = head;
        int count = 0;

        while (curr != null) {
            if (count == index) {
                return curr.value;
            }
            curr = curr.next;
            count++;
        }

        return -1;
    }

    public void addAtHead(int val) {
        MyLinkedList newNode = new MyLinkedList(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }


    public void addAtTail(int val) {
        MyLinkedList newNode = new MyLinkedList(val);
        if (head == null) {
            head = newNode;
        } else {
            MyLinkedList tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }

    }




    public void addAtIndex(int index, int val) {
        if (index < 0) return;

        MyLinkedList newNode = new MyLinkedList(val);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        MyLinkedList curr = head;
        int count = 0;

        while (curr != null && count < index - 1) {
            curr = curr.next;
            count++;
        }

        if (curr == null) return;

        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || head == null) {
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        MyLinkedList curr = head;
        int count = 0;

        while (curr.next != null && count < index - 1) {
            curr = curr.next;
            count++;
        }

        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }
}
