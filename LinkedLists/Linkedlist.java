package LinkedLists;

class Linkedlist{
    Node head;
    
    static class Node{
        int value;
        Node next;
        
        Node (int data){
            value = data;
            next = null;
        }
    }
    
    public static void main(String[] args){
        Linkedlist linkedlist = new Linkedlist();
        
        // Assigning value
        linkedlist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        
        // Connecting Nodes
        linkedlist.head.next = second;
        second.next = third;
        third.next = fourth;
        
        // Traversing Linked list
        while (linkedlist.head != null){
            System.out.print(linkedlist.head.value + "|-->|");
            linkedlist.head = linkedlist.head.next;
        }
    }
}
