import java.util.Scanner;
public class Compound_interest_calculator_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in); 

        // Variables
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        // User input amount
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        // User input rate
        System.out.print("Enter the interest rate as percentage: ");
        rate = scanner.nextDouble()/ 100;
        
        // User input times compounded
        System.out.print("Enter the number of times interest is compounded per year: ");
        timesCompounded = scanner.nextInt();

        // User input years
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        // Compound interest formula
        amount = principal * Math.pow((1 + rate / timesCompounded), timesCompounded * years);

        // Output the result 
        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close();
    }
}
