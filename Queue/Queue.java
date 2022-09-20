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
    public Boolean isFull() {
        if (front == 0 && rear == size - 1)
            return true;
        else
            return false;
    }
}
