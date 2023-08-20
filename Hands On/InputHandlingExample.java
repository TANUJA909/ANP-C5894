/*
Thursday Lab
Question 3:  
Write a Java program that reads an integer from the user using the Scanner class.
 Handle the InputMismatchException that can occur if the user enters a non-integer value. 
Display an appropriate error message.
*/

import java.util.InputMismatchException; // Import the InputMismatchException class
import java.util.Scanner; // Import the Scanner class
 
public class InputHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
 
        try {
            System.out.print("Enter an integer: ");
            int userInput = scanner.nextInt(); // Read user input as integer
            System.out.println("You entered: " + userInput);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer."); // Handle InputMismatchException
        } finally {
            scanner.close(); // Close the Scanner to release resources
        }
    }
}
 
