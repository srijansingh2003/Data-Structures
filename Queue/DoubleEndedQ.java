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

}
