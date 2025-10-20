public class Arithmatic_5 {
    
    public static void main(String[] args) {

        // Order of operations: 
        //PEMDAS (Parentheses, Exponents, Multiplication and Division, Addition and Subtraction)
        // or BODMAS (Brackets, Orders, Division and Multiplication, Addition and Subtraction)

        double result = 3 + 4 * (7 - 5) / 2.0;  

        // Calculation steps:
        // 1. Parentheses/Brackets: (7 - 5) = 2
        // 2. No Exponents/Orders in this case
        // 3. Multiplication: 4 * 2 = 8
        // 4. Division: 8 / 2.0 = 4.0
        // 5. Addition: 3 + 4.0 = 7.0

        System.out.println(result); // Output: 7.0

    }

}
