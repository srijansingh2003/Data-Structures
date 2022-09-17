package Recursion;

public class ProdDigits {
    public static void main(String[] args) {
        int prod = Prod(12345);
        System.out.println(prod);
    }

    public static int Prod(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return Prod(n / 10) * (n % 10);
        }
    }

}
