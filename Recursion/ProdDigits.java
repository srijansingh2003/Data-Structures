package Recursion;

public class ProdDigits {
    public static void main(String[] args) {
        int prod = Prod(12345);
        System.out.println(prod);
    }

    public static int Prod(int n) {
        if (n % 10 ==  n) {
            return n;
        } else {
            return Prod(n / 10) * (n % 10);
        }
    }

}
