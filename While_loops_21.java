import java.util.Scanner;

public class While_loops_21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";

        // Using a while loop to ensure the user enters a non-empty name
        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello, " + name + "! Welcome!");

        String response = "";

        while (!response.equals("Q")) {
            System.out.print("You are in the loop. ");
            System.out.print("Enter 'Q' to quit: ");
            response = scanner.nextLine();
        }

        System.out.println("You have exited the loop. Goodbye!");

        scanner.close();

    }

}
