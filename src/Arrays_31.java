import java.util.Arrays;

public class Arrays_31 {
    
    public static void main(String[] args) {
        
        // array = a collection of values of the same data type.

         String[] fruits = {"apple", "orange", "banana", "coconut"};

         fruits[0] = "pineapple"; 
         // Store array length as variable.
         int numOfFruits = fruits.length;

         Arrays.sort(fruits);
         

        System.out.println(Arrays.toString(fruits));
        System.out.println(numOfFruits);

        // Iterate over array and print each entry.
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // Replace all entries in array with value.
        Arrays.fill(fruits, "pineapple");
        System.out.println(Arrays.toString(fruits));

    }

}
