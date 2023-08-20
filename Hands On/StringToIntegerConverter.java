/*
 Thursday Lab
Question 4:  Write  a Java program that reads a string input from the user. Convert the string to an integer using the Integer.parseInt() method. 
Handle the NumberFormatException that can occur if the input cannot be parsed as an integer. 
Display a message indicating that the input is not a valid integer.
*/
import java.util.Scanner; // Import the Scanner class for user input
 
public class StringToIntegerConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input
 
        System.out.print("Enter a string: "); // Prompt the user for input
        String userInput = scanner.nextLine(); // Read the user's input as a string
 
        try {
            int intValue = Integer.parseInt(userInput); // Convert the string to an integer
            System.out.println("Integer value: " + intValue); // Display the converted integer
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException if input cannot be parsed
            System.out.println("Input is not a valid integer.");
        }
 
        scanner.close(); // Close the Scanner to free resources
    }
}
