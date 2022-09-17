package Recursion;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(Palin(123321));
    }

    public static int rev(int n) {
        int digit = (int) (Math.log10(n)) + 1;
        return counter(n, digit);
    }

    public static int counter(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digit - 1)) + counter(n / 10, digit - 1);
    }

    public static boolean Palin(int n) {
        return n == rev(n);
    }

}
