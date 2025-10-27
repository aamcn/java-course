public class Ternary_operator_16 {
    public static void main(String[] args) {
      
    // Ternary Operator = Return one of two values based if a condition is true or false.

    // variable = condition ? value if true : value if false;

        int score = 55; 

        // Normal if-else statement
        if(score >= 60){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");   
        }

        // Ternary Operator version of same statement
        String result = (score >= 60) ? "Passed" : "Failed";
        System.out.println(result);

      }
}
