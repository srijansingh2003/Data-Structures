import java.util.Scanner;

public class String_rev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENter a string:");
        String str = input.next();
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);
    }
}