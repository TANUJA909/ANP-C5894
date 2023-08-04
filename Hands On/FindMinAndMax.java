package thursdayLab_3_8_2023;
/*
Thursday Lab
Question 2: Given an array of integers, 
write a Java program to find the maximum and minimum elements in the array.
*/
import java.util.Scanner;

public class FindMinAndMax 
{
	// find the minimum and maximum number in an array
    public static void findMinAndMax(int[] numbers)
    {
        // initialize minimum and maximum element with the first element
        int max = numbers[0];
        int min = numbers[0];
 
        // do for each array element
        for (int i = 1; i < numbers.length; i++)
        {
            // if the current element is greater than the maximum found so far
            if (numbers[i] > max) {
                max = numbers[i];
            }
 
            // if the current element is smaller than the minimum found so far
            else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
 
        System.out.println("The minimum array element is " + min);
        System.out.println("The maximum array element is " + max);
    }

	public static void main(String[] args) 
	{
		// scanner class object
        Scanner sc = new Scanner(System.in);

        //takes the size of the array as input from the user. 
        System.out.print("Enter the size of the array: ");
        
        //integer input from the user.
        int size = sc.nextInt();
        int[] numbers = new int[size]; 

        //prompt the user to enter elements of the array.
        System.out.println("Enter " + size +" elements of the array: ");
        for (int i = 0; i < size; i++)
        {
            numbers[i] = sc.nextInt();
        }
        // find the minimum and maximum element, respectively
        findMinAndMax(numbers);
        sc.close();

	}

}
