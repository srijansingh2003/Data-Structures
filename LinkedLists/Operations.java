class Operations{
    Node head;
    
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    public void insertAtBegin(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    public void insertAfter(Node prev_node, int new_data){
	    if (prev_node == null) {
      		System.out.println("The given previous node cannot be null");
      		return;
    }
	    Node new_node = new Node(new_data);
	    new_node.next = prev_node.next;
	    prev_node.next = new_node;
    }
	
    public void insertAtEnd(int new_data){
	    Node new_node = new Node(new_data);
	    if (head == null) {
            head = new Node(new_data);
            return;
            }
	    new_node.next = null;
	    
	    Node last = head;
	    
	    while(last.next != null){
	        last = last.next;
	    }
	    
	    last.next = new_node;
	    return;
     }
	
     boolean search(Node head, int key){
	    Node current = head;
	    
	    while(current != null){
	        if(current.data == key)
	            return true;
	        current = current.next;
	    }
	    return false;
     }
     
     public void printList(){
        Node tnode = head;
        while(tnode != null){
            System.out.print(tnode.data + "|-->|");
            tnode = tnode.next;
        }
     }
    
    
    public static void main(String[] args){
        Operations linkedlist = new Operations();
        
        linkedlist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        
        
        linkedlist.head.next = second;
        second.next = third;
        
        linkedlist.insertAtBegin(23);
        linkedlist.insertAtBegin(46);
        linkedlist.insertAfter(second.next,25);
        linkedlist.insertAfter(linkedlist.head,69);
	linkedlist.insertAtEnd(99);
        linkedlist.insertAfter(linkedlist.head.next,70);
	if (linkedlist.search(linkedlist.head,25))
          System.out.println(25 + " is found");
        else
          System.out.println(25 + " is not found");
	
	linkedlist.printList();
        
    }
}
