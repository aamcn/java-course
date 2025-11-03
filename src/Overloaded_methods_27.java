public class Overloaded_methods_27 {
    public static void main(String[] args) {
        
        //Overloaded methods = methods that share the same name but have 
        // different parameters (different type, order, or number of parameters)
        // signature = name + parameter

        //EXAMPLE 1: 
        // Both methods have the same name "add" but different parameters
        // so their signatures are different and act as separate methods.

         System.out.println(add(1,2));           // int, int
        
         System.out.println(add(1,2,3));         // int, int, int
    
        //EXAMPLE 2:

        // All methods have the same name "bakePizza" but different parameters
        // The correct method is called based on the arguments passed. 

        String pizza = bakePizza("flat bread", "mozzarella");
        System.out.println(pizza);               // mozzarella flat bread pizza
        
        String pizza2 = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza2);              // pepperoni mozzarella flat bread pizza
        }

    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }
    
    static String bakePizza(String bread){
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza"; 
    }

    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
