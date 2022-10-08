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

    public void insertAfter(Node prev_node, int data) {
        if (prev_node == null) {
            System.out.println("Previous Node cannot be null`");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
        new_node.prev = prev_node;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }

    }
}
