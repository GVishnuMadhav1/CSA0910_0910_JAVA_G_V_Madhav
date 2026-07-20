import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();

            if (n < 0) {
                System.out.print("Invalid Input");
                return;
            }

            int fact = 1;

            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            System.out.print(n + " Factorial = " + fact);

        } catch (Exception e) {
            System.out.print("Invalid Input");
        }
    }
}