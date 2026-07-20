import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // swap if needed
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            boolean found = false;

            for (int i = a; i <= b; i++) {
                if (i > 1) {
                    int count = 0;

                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    }

                    if (count > 2) {
                        System.out.print(i + " ");
                        found = true;
                    }
                }
            }

            if (!found) {
                System.out.print("No Composite Numbers");
            }

        } catch (Exception e) {
            System.out.print("Invalid Input");
        }
    }
}