import java.util.Scanner; 

public class MathClass_09 {
    public static void main(String[] args){

        // Math class methods
      
        // 2 raised to the power of 5
        double result = Math.pow(2, 5);

        // Absolute value of -5
        double absValue = Math.abs(-5);

        // Square root of 25
        double sqrtValue = Math.sqrt(25);

        // Rounding 2.6 to the nearest integer
        double roundValue = Math.round(2.6);

        // Rounds up to the nearest integer
        double ceilValue = Math.ceil(2.3); 

        // Rounds down to the nearest integer
        double floorValue = Math.floor(2.7);

        // Rounds down to the nearest integer
        double maxValue = Math.max(5, 10);

        double minValue = Math.min(5, 10);


        System.out.println(result);
        System.out.println(absValue);
        System.out.println(sqrtValue);
        System.out.println(roundValue);
        System.out.println(ceilValue);
        System.out.println(floorValue);
        System.out.println(maxValue);
        System.out.println(minValue);


        //Hypotenuse of a right triangle example 


        Scanner scanner = new Scanner(System.in);

        double a; 
        double b;
        double c; 

        System.out.print("Enter the length of side a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        b = scanner.nextDouble();


        System.out.println(a);
        System.out.println(b);

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse side c is: " + c + "cm");

        scanner.close();


    }
}