package Queue;

class DoubleEndedQ {
    int items[];
    int front;
    int rear;
    int size;

    DoubleEndedQ(int size) {
        items = new int[size];
        this.size = size;
        front = -1;
        rear = 0;
    }

    boolean isFull() {
        return ((front == -1 && rear == size - 1) || front == rear + 1);
    }

    boolean isEmpty() {
        return (front == -1);
    }

    void insertFront(int x) {
        if (isFull()) {
            System.out.println("Overflow");
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0)
            front = size - 1;
        else
            front--;

        items[front] = x;
    }

    void insertRear(int x) {
        if (isFull()) {
            System.out.println("Overflow");
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == size - 1)
            rear = 0;
        else
            rear++;

        items[rear] = x;
    }

    void deleteFront() {
        if (isEmpty()) {
            System.out.println("UnderFlow");
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1)
            front = 0;
        else
            front++;
    }

    void deleteRear() {
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0)
            rear = size - 1;
        else
            rear--;
    }

    int getRear() {
        if (isEmpty()) {
            System.out.println("UnderFlow");
            return -1;
        }
        return items[rear];
    }

}
