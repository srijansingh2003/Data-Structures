package Recursion;

public class SumDigits {
    public static void main(String[] args) {
        int sum = Sum(64695);
        System.out.println(sum);
    }

    public static int Sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return Sum(n / 10) + (n % 10);
        }
    }
}
