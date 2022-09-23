package Queue;

public class CircularQueue {
    int items[];
    int size;
    int front;
    int rear;

    CircularQueue(int size) {
        items = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }

    // To check if Queue is full
    public Boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        } else {
            return false;
        }
    }

    // To check if Queue is empty
    public Boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // Inserting elements in the Circular Queue
    public void enQueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % size;
            items[rear] = x;
        }
    }

    // Removing element from the Circular Queue
    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            int item = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == size - 1) {
                front = 0;
            } else {
                front = (front + 1) % size;
            }
        }
    }

    // Displaying the Queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i != rear; i = (i + 1) % size) {
                System.out.print(items[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        q.enQueue(6);
        q.enQueue(2);
        q.enQueue(8);
        q.enQueue(7);
        q.display();
        q.deQueue();
        q.display();
    }
}
