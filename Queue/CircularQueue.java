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
}
