package week10;
import java.util.Scanner;

public class Week10Program3 {
    static Scanner userinput = new Scanner(System.in);

    static double computePayment(double loanAmt, double annualRate, int years) {
        double monthlyRate = (annualRate / 100.0) / 12;  // convert annual % to monthly decimal
        int numPayments = years * 12;                    // convert years to months

        // Monthly payment formula
        double numerator = monthlyRate * Math.pow(1 + monthlyRate, numPayments);
        double denominator = Math.pow(1 + monthlyRate, numPayments) - 1;
        double monthlyPayment = loanAmt * (numerator / denominator);

        return monthlyPayment;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Monthly Mortgage Calculator");

        System.out.print("\nEnter loan amount (principal): ");
        double loan = userinput.nextDouble();

        System.out.print("Enter yearly interest rate (as a percent, e.g. 6.5): ");
        double rate = userinput.nextDouble();

        System.out.print("Enter number of years: ");
        int years = userinput.nextInt();

        double payment = computePayment(loan, rate, years);

        System.out.printf("%nThe monthly payment is: $%.2f%n", payment);
        System.out.println("Thank you for using the Mortgage Calculator!");


	}

}
