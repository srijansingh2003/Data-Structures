package Queue;

class Queue {
    int items[];
    int front;
    int rear;

    Queue(int size) {
        items = new int[size];
        front = -1;
        rear = -1;
    }

    // Checking whether Queue is empty
    public Boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // Checking whether Queue is full
    public Boolean isFull(int size) {
        if (front == 0 && rear == size - 1)
            return true;
        else
            return false;
    }

    // Inserting an element in a Queue
    public void enQueue(int x) {
        if (isFull(size)) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = x;
        }
    }

    // Removing an element from Queue
    public int deQueue() {
        int x;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            x = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
        }
        System.out.println("Deleted:" + x);
        return x;
    }

}

    // Printing Queue
    public void display(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            for (int i = front; i <= rear; i++) {
                System.out.print(items[i] + " ");
            }
        }
    }
