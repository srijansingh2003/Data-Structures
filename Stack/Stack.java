package Stack;

class Stack {
    private int arr[];
    private int top;
    private int max;

    Stack(int size) {
        arr = new int[size];
        max = size;
        top = -1;
    }

    // Inserting Element in Stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow");
            System.exit(1);
        }
        arr[++top] = x;
    }

    // Removing Element from Stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            System.exit(1);
        }
        return arr[top--];
    }
}
