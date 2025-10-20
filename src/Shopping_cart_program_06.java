import java.util.Scanner;

public class Shopping_cart_program_06 {
    public static void main(String[] args) {
        
    // SHOPPING CART PROGRAM WITH USER INPUT

    Scanner scanner = new Scanner(System.in);
    
    String item;
    double price;
    int quantity;
    char currency = '$';
    double total = 0.0;

    System.out.print("What item would you like to buy?");
    item = scanner.nextLine();

    System.out.print("What is the price of each");
    price = scanner.nextDouble();  

    System.out.print("How many would you like to buy?");
    quantity = scanner.nextInt();

    total = price * quantity;

    System.out.println("You have purchased " + quantity + " " + item + "(s) at a price of " + currency + price + " each.");
    System.out.println("Your total is " + currency + total + ".");
    scanner.close();

    }
}
 