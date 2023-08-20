 
/*
Thursday Lab
Question 2. 
Write a Java program that sorts a list of strings in alphabetical order using the Collections framework.
*/
 
import java.util.ArrayList; // Import the ArrayList class
import java.util.Collections; // Import the Collections class
import java.util.List; // Import the List interface
 
public class ListSortingExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(); // Create an ArrayList to store strings
        
        // Add strings to the list
        stringList.add(“Banana”);
        stringList.add(“Apple”);
        stringList.add(“Orange”);
        stringList.add(“Grapes”);
 
        System.out.println(“List before sorting: “ + stringList);
 
        // Sort the list in alphabetical order
        Collections.sort(stringList);
 
        System.out.println(“List after sorting: “ + stringList);
    }
}
 
 
