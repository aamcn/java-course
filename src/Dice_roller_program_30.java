import java.util.Scanner;
import java.util.Random;

public class Dice_roller_program_30 {
    
    public static void main(String[] args) {
         
        // JAVA DICE ROLLER PROGRAM

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;

        System.out.print("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        if(numOfDice > 0){

            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);

        } else {
            System.out.println("# of dice must be greater than 0");
        }

    scanner.close();
    }

    static void printDie(int roll){

        String dice1 = """
             -------            
            |       |
            |   O   |
            |       |
             -------
            """;

        String dice2 = """
             -------            
            | O     |
            |       |
            |     O |
             -------
            """;

        String dice3 = """
             -------            
            | O     |
            |   O   |
            |     O |
             -------
            """;

        String dice4 = """
             -------            
            | O   O |
            |       |
            | O   O |
             -------
            """;

        String dice5 = """
             -------            
            | O   O |
            |   O   |
            | O   O |
             -------
            """;
       
        String dice6 = """
             -------            
            | O   O |
            | O   O |
            | O   O |
             -------
            """;
        
        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
                    
        }

    }
}
