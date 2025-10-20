import java.util.Scanner;

public class ifStatements_06 {
    public static void main (String[] args) {
        
        // if statement: Performs a block of code depending on the condition being true or false

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 

        System.out.print("How old are you? ");
        int number = scanner.nextInt();

        System.out.print("Are you a student (true/false)?");
        boolean isStudent = scanner.nextBoolean();

        if(name ==  null || name.isEmpty()){
            System.out.println("You didn't enter your name."); 
        } else {
            System.out.println("Hello " + name + "!");
        }

        if (number > 17 && number < 65){
            System.out.println("You are an adult.");
        }
        else if (number >= 65){
            System.out.println("You are a senior citizen.");
        }
        else if (number == 0) {
            System.out.println("You are a baby.");
        } else if (number < 0){
            System.out.println("You haven't been born yet.");
        }

        if(isStudent){
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }
        
        scanner.close();

    }
}
