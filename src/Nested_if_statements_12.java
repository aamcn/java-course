public class Nested_if_statements_12 {

    public static void main(String[] args) {

        boolean isStudent = false;
        boolean isSenior = false;
        double price = 9.99;

        // Nested if statements
        // Check if the customer is a student
        if (isStudent) {
            // Check if the customer is also a senior
            if (isSenior) {
                // If both student and senior, apply both discounts
                System.out.println("You get a student discount of 10%");
                System.out.println("You get a senior student discount of 20%");
                price *= 0.7;
            } else {
                // If not a senior, only student discount applies 
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        } else {
            // If not a student, check if the customer is a senior
            if (isSenior) {
                // If senior, apply senior discount
                System.out.println("You get a senior discount of 20%.");
                price *= 0.8;
            }
        }

        System.out.printf("The price of a ticket is: $%.2f\n", +price);

    }

}