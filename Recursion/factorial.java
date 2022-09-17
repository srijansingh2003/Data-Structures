package Recursion;

public class factorial {

    public static void main(String[] args) {
        int fac = fact(6);
        System.out.println(fac);
    }

    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
