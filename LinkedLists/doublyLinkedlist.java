package LinkedLists;

public class doublyLinkedlist {
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            this.data = d;
        }
    }

    public void insertFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

}
