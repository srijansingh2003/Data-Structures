package Recursion;

public class uptoN {
    public static void main(String[] args) {
        upton(9);
    }

    public static void upton(int n) {
        if (n == 0) {
            return;
        } else {
            upton(n - 1);
            System.out.print(n + " ");
        }
    }
}
