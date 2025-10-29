import java.util.Scanner;

public class For_loops_23 {
    public static void main(String[] args) throws InterruptedException{
    
Scanner scanner = new Scanner(System.in);

//Example 1: Print "Hello World" n times.

System.out.print("Enter how many times you want to loop: ");
int n = scanner.nextInt();

for (int i = 1; i <= n; i++) {
    System.out.println("Hello World " + i);
}

//Example 2: Countdown from 10 to 1 with a 1 second pause between each number.

int start = 10;

for(int i = start; i >= 1; i--) {
    System.out.println(i);
    Thread.sleep(1000); // Pause for 1 second
}

scanner.close();  
    }
}