import java.util.Scanner;

public class Substrings_14 {
    public static void main(String[] args) {

        // .substring() = A method that extracts a part of a string
        // .substring(start, end) extracts from start index to end index (end index not
        // included)
        // .substring(start) extracts from start index to the end of the string

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        if (!email.contains("@")) {
            System.out.println("Error: Email must include '@' symbol.");
            scanner.close();
            return;

        } else {
            // Extracts characters from index 0 to 6 (7 is exclusive)
            String username = email.substring(0, email.indexOf("@"));
            // Extracts characters from index 14 to the end of the string
            String domain = email.substring(email.indexOf("@") + 1);

            // print results
            System.out.println("Your email is: " + email);
            System.out.println();
            System.out.println("email.substring(0, 7) = " + username);
            System.out.println();
            System.out.println("email.substring(14) = " + domain);
            System.out.println();
        }

        scanner.close();
    }
}
