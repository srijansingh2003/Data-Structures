package Recursion;

public class Sum_upto_n {

    public static void main(String[] args) {
        int sum = Sum(10);
        System.out.println(sum);
    }

    public static int Sum(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n + Sum(n - 1);
        }
    }
}
