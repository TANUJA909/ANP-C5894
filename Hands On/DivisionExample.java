/*
Thursday Lab
Question 2 .Write a program that attempts to divide two numbers. Whether the division is successful or not, make sure to display a "Division completed" message. 
Ensure that the division operation is performed in a try block and the "Division completed" message is displayed in a finally block.
*/

import java.util.Scanner; // Import the Scanner class
 
public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
 
        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt(); // Read numerator from user input
 
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt(); // Read denominator from user input
 
            int result = numerator / denominator; // Attempt division
            System.out.println("Result of division: " + result); // Display result if division successful
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!"); // Catch division by zero exception
        } finally {
            System.out.println("Division completed"); // Display message regardless of outcome
            scanner.close(); // Close the Scanner to release resources
        }
    }
}
