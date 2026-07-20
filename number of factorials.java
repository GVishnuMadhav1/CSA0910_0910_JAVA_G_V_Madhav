import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.print("Invalid Input");
                return;
            }

            int count = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            System.out.print("Number of factors = " + count);

        } catch (Exception e) {
            System.out.print("Invalid Input");
        }
    }
}