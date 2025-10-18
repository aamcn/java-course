public class Main {

    public static void main(String[] args) {

        // variable = a reusable container for a value;
        // A variable behaves as if it is the value it contains.

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the heap

        // Examples:
        // Primitive: Is like being given a ten pound note.
        // Reference: Is like being given an IOU for ten pounds.

        // Primitive vs Reference
        // ---------    ---------
        // int          string
        // double       array
        // char         object
        // boolean

        // The two Steps to creating a variable.
        // -------------------------------

        // 1. Declaration
        // 2. Assignment

        
        // declaration
        int age;
        // assignment
        age = 30;
        // Should print 30
        System.out.println(age);

        //INT = whole numbers
        // You can also do both steps in one line
        int year = 2025; 
        // Should print "The year is 2025" 
        System.out.println("The year is " + year);


        // DOUBLE = decimal numbers
        double price = 10.99;
        // Should print "The price is 10.99"
        System.out.println("The price is " + price);

        // CHAR = single character
        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        // Should print "The grade is A"
        System.out.println("The grade is " + grade);

        // BOOLEAN = true or false
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        // Should print "Is Java fun? true"
        System.out.println("Is Java fun? " + isJavaFun);

        // Conditional statement based on boolean value
        if(isFishTasty == false) {
            // Should print "I don't like fish"
            System.out.println("I don't like fish");
        } else {
            System.out.println("I like fish");
        }

        // REFERENCE 

        String name = "Tony Boney";
        String food = "Pizza"; 
        // Should print "Hello, Tony Boney"
        System.out.println("Hello, " + name);
        // Should print "I like Pizza"
        System.out.println(name + "'s favorite food is " + food);

        String car = "Golf";
        String color = "Silver";
        Boolean isCarWorking = false;

        if(isCarWorking == false) {
            // Should print "My Silver Golf is not working"
            System.out.println("My " + color + " " + car + " is not working");
        } else {
            System.out.println("My " + car + " is working");
        }
    }
}