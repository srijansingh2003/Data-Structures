package Queue;

public class CircularQueue {
    int items[];
    int max;
    int front;
    int rear;

    CircularQueue(int size) {
        items = new int[size];
        max = size;
        front = -1;
        rear = -1;
    }

    public Boolean isFull(int size) {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        } else {
            return false;
        }
    }
}
