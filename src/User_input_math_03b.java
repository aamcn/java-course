import java.util.Scanner;
public class User_input_math_02b {

    public static void main(String[] args) {
        
        // Calculate area of a rectangle based on user input

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("The area of the rectangle is: " + area + " cm²");

        scanner.close();
    }   

}
