import java.util.Random;

public class RandomNumbers_08 {
    public static void main(String[] args){

    Random random = new Random(); 

    int number; 

    // Generate random whole number between 1 and 999
    number = random.nextInt(1, 1000);

    System.out.println(number);

    double decimalNumber;
    
    // Generate random decimal number between 0.0 and 1.0
    decimalNumber = random.nextDouble();

    System.out.println(decimalNumber);

    boolean isHeads; 

    // Generate random boolean value
    isHeads = random.nextBoolean();

    if(isHeads){
        System.out.println("Heads");
    } else {
        System.out.println("Tails");

    }
    
}
}
