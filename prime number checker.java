import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();

            if (n <= 1) {
                System.out.print("Not a Prime Number");
                return;
            }

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print("Prime Number");
            } else {
                System.out.print("Not a Prime Number");
            }

        } catch (Exception e) {
            System.out.print("Invalid Input");
        }
    }
}