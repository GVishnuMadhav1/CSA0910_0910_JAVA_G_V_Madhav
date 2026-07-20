import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();

            if (n < 2) {
                System.out.print("No Prime Numbers");
                return;
            }

            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(i + " ");
                }
            }

        } catch (Exception e) {
            System.out.print("Invalid Input");
        }
    }
}