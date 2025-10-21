public class String_methods_13 {
    public static void main(String[] args) {

        // Initialize the string
        String name = "Tony";
        System.out.println("The initial string (name) is " + name);
        System.out.println();

        // Print length of the string
        int length = name.length();
        System.out.println("name.length() returned: " + length);
        System.out.println();

        // Get character at index 0
        char letter = name.charAt(0);
        System.out.println("name.charAt(0) method returned: " + letter);
        System.out.println();

        // Convert string to uppercase
        String uppercaseName = name.toUpperCase();
        System.out.println("name.toUpperCase() method returned: " + uppercaseName);
        System.out.println();

        // Convert string to lowercase
        String lowercaseName = name.toLowerCase();
        System.out.println("name.toLowerCase() method returned: " + lowercaseName);
        System.out.println();

        // Trim whitespace from the string
        String nameTrim = name.trim();
        System.out.println("name.trim() method returned: " + nameTrim);
        System.out.println();

        // Replace characters in the string
        String nameReplaced = name.replace('o', 'a');
        System.out.println("name.replace('o', 'a') method returned: " + nameReplaced);
        System.out.println();

        // Check if the string is empty
        if(name.isEmpty()){
            System.out.println("The string is empty.");
        } else {
            System.out.println("name.isEmpty() method returned: false");
        }
        System.out.println();

        // Check if the string contains a char or string fragment
        if(name.contains("T")){
            System.out.println("name.contains(\"T\") method returned: true");
        } else {
            System.out.println("name.contains(\"T\") method returned: false");
        }
        System.out.println();

        // Check equality with input string
        if(name.equals("Tony")){
            System.out.println("name.equals(\"Tony\") method returned: true");
        } else {
            System.out.println("name.equals(\"Tony\") method returned: false");
        }
        System.out.println();

        // Check equality ignoring strings case
        if(name.equalsIgnoreCase("tony")){
            System.out.println("name.equalsIgnoreCase(\"tony\") method returned: true");
        } else {
            System.out.println("name.equalsIgnoreCase(\"tony\") method returned: false");
        }
        System.out.println();


    }

}