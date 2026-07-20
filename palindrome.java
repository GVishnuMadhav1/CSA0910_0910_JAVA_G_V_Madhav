import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();

            int original = n;
            int reverse = 0;

            while (n != 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n = n / 10;
            }

            if (original == reverse) {
                System.out.print("Palindrome Number");
            } else {
                System.out.print("Not a Palindrome Number");
            }

        } catch (Exception e) {
            System.out.print("Invalid Input");
        }
    }
}