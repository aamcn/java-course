import java.util.Scanner;
public class Logical_operators_20 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // && = AND
        // || = OR
        // ! = NOT


        // Example 1

        double temp = 40; 
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is good!");
            System.out.println("It is sunny!");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is good!");
            System.out.println("But it is not sunny!");
        } else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad!");
        }

        // Example 2 - Username validation
        
        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4 and 12 characters long.");
        } else if(username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores.");
        }
        else {
            System.out.println("Welcome " + username);
        }

        scanner.close();
    }

}
