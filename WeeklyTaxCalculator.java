import java.util.Scanner;

public class WeeklyTaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weekly income: $");
        double income;

        try {
            income = scanner.nextDouble();

            if (income < 0) {
                System.out.println("Income must be a positive number.");
                return;
            }

            double taxRate;
            if (income < 500) {
                taxRate = 0.10;
            } else if (income < 1500) {
                taxRate = 0.15;
            } else if (income < 2500) {
                taxRate = 0.20;
            } else {
                taxRate = 0.30;
            }

            double taxWithheld = income * taxRate;

            System.out.printf("\nWeekly Tax Withheld: $%.2f\n", taxWithheld);
            System.out.printf("Tax Rate Applied: %.0f%%\n", taxRate * 100);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        }

        scanner.close();
    }
}