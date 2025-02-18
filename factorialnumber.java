import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Call the method to calculate factorial
        long result = factorial(number);
        
        // Display the result
        System.out.println("The factorial of " + number + " is: " + result);
    }
    
    /
