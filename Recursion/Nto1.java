package Recursion;

public class Nto1 {

    public static void main(String[] args) {
        fun(9);
    }

    public static void fun(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(n + " ");
            fun(n - 1);
        }
    }
}
