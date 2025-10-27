import java.util.Scanner;

public class Enhanced_switches_18 {
    
    // Enhanced Switches (Java 14+)
    // A replacement to many else if statements.
    // Java 14 feature.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("It is not the weekend :( )");
            case "saturday",  "sunday" -> System.out.println("It is the weekend :)");
            default -> System.out.println("Invalid day");
        };

        scanner.close();    
    }
}
