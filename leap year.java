import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String date = sc.next();
            String[] parts = date.split("/");

            if (parts.length != 3) {
                System.out.print("Invalid Input");
                return;
            }

            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            // Basic validation
            if (day <= 0 || month <= 0 || month > 12) {
                System.out.print("Invalid Input");
                return;
            }

            // Leap year logic
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.print("Given year is Leap Year");
            } else {
                System.out.print("Given year is Non Leap Year");
            }

        } catch (Exception e) {
            System.out.print("Invalid Input");
        }
    }
}