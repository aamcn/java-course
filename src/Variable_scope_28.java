public class Variable_scope_28 {

    static int x = 3; // global variable (class-level) : Is not used in this example.
    public static void main(String[] args) {

        // variable scope = where a variable can be accessed.
        // variables declared inside a method has local scope.

        int x = 1; // local variable to main method

        System.out.println(x); // accessible here

        doSomething();

    }

    static void doSomething() {

        int x = 2; // local variable to doSomething method

        System.out.println(x); // accessible here
        
    }

}
