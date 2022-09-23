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
}
