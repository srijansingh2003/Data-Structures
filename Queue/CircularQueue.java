package Queue;

import javax.lang.model.util.ElementScanner14;

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

    // To check if Queue is full
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

    // To check if Queue is empty
    public Boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // Inserting elements in the Circular Queue
    public void enQueue(int x) {
        if (isFull(max)) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 1;
                rear = 1;
            } else if (rear == max - 1) {
                rear = 0;
            } else {
                rear++;
            }
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
            } else if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
        }
    }
