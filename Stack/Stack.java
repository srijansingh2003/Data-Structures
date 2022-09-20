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
    public int pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            System.exit(1);
        }
        return arr[top--];
    }

    // Size of the Stack
    public int size() {
        return top + 1;
    }

    // Check condition for Underflow
    public Boolean isEmpty() {
        return top == -1;
    }

    // Check condition for Overflow
    public Boolean isFull() {
        return top == max - 1;
    }

    // Printing Stack
    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.print();
        stack.push(1);
        stack.push(9);
        stack.pop();
        System.out.println("\nAfter popping out");
        stack.print();

    }
}
