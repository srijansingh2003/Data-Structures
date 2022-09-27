class Operations{
    Node head;
    
    static class Node{
        int value;
        Node next;
        
        Node(int d){
            value = d;
            next = null;
        }
    }
    
    public void insertAtBegin(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    public void insertAfter(Node prev_node, int new_data){
	    Node new_node = new Node(new_data);
	    new_node.next = prev_node.next;
	    prev_node.next = new_node;
	}
    
    
    public static void main(String[] args){
        Operations llist = new Operations();
        
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        
        
        llist.head.next = second;
        second.next = third;
        
        llist.insertAtBegin(23);
        llist.insertAtBegin(46);
        linkedlist.insertAfter(second.next,25);
        linkedlist.insertAfter(linkedlist.head,69);
        linkedlist.insertAfter(linkedlist.head.next,70);
        
        while(llist.head != null){
            System.out.print(llist.head.value + "|-->|");
            llist.head = llist.head.next;
        }
    }
}
