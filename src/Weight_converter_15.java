import java.util.Scanner;
public class Weight_converter_15 {
    
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Converter");
        System.out.println("1. Pounds to Kgs");
        System.out.println("2. Kgs to Pounds");

        System.out.print("Choose an option (1 or 2): ");
        choice = scanner.nextInt();

        System.out.println(choice);

        if(choice == 1){
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.4535921;
            System.out.printf("The new weight in kgs is : %.2f", newWeight); 
        } else if (choice == 2){
            System.out.print("Enter weight in kgs : ");   
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is : %.2f", newWeight);
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}