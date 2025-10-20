import java.util.Scanner;

public class User_Input_02 {
    public static void main(String[] args) {
        
//          Class Scanner:    
//          --------------

// A simple text scanner which can parse primitive types and strings using
// regular expressions.
// A Scanner breaks its input into tokens using a delimiter pattern, which by
// default matches whitespace.
// for example, this code allows a user to read a number from system in:

        /*
         * Scanner sc = new Scanner(System.in); 
         * int i = sc.nextInt();
         */

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        // String name is used to store the user input
        String name = scanner.nextLine();

        
        System.out.println("Hello, " + name + "!");

        System.out.print("Enter your age: ");
        // int age is used to store the user input
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        System.out.print("What is your height in feet? ");
        // double height is used to store the user input
        double height = scanner.nextDouble();
        System.out.println("You are " + height + " feet tall.");

        System.out.print("Are you a toad ? (true/false): ");
        // boolean isToad is used to store the user input
        boolean isToad = scanner.nextBoolean();
        System.out.println("Toad status: " + isToad);

        // Always close the scanner when you're done to prevent problems.
        scanner.close();


        // COMMON ISSUES:
        // ----------------------
        // 1. Forgetting to import the Scanner class:
        // 2. Not creating a Scanner object:
        // 3. Using the wrong method to read input:
        // 4. Not closing the Scanner:
        // 5. Not using nextLine() after nextInt() or nextDouble(). Skipping the newline.
    }
}
