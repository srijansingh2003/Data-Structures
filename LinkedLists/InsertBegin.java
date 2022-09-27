class InsertBegin {
    Node head;
    
    static class Node{
        int value;
        Node next;
        
        Node(int d){
            value = d;
            next = null;
        }
    }
    
    static void insertAtBegin(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    
    public static void main(String[] args){
        InsetBegin llist = new InsertBegin();
        
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        
        
        llist.head.next = second;
        second.next = third;
        
        llist.insertAtBegin(23);
        llist.insertAtBegin(46);
        
        
        while(llist.head != null){
            System.out.print(llist.head.value + "|-->|");
            llist.head = llist.head.next;
        }
    }
}
