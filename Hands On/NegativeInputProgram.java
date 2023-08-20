/*
Thursday Lab
Question 1: lab 1:Write a program that takes an integer input from the user and throws this custom exception if the input is negative.
 Catch the exception and display an error message accordingly.
 */


import java.util.Scanner;
 
// Custom exception class
class NegativeInputException extends Exception {
    public NegativeInputException(String message) {
        super(message);
    }
}
 
public class NegativeInputProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter an integer: ");
            
            // Read an integer from user input
            int input = scanner.nextInt();
            
            // Check if input is negative
            if (input < 0) {
                // Throw the custom exception with an error message
                throw new NegativeInputException("Input cannot be negative");
            } else {
                System.out.println("Input is valid: " + input);
            }
        } catch (NegativeInputException e) {
            // Catch and handle the custom exception
            System.out.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            // Handle non-integer input
            System.out.println("Error: Invalid input. Please enter an integer.");
        } finally {
            // Close the Scanner
            scanner.close();
        }
    }
}
