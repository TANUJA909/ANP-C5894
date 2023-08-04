package thursdayLab_3_8_2023;
/*
Thursday Lab
Question 1: Write a Java program to find the average of all elements in an array of doubles.
*/
import java.util.Scanner;

public class Average 
{

	public static void main(String[] args)
	{
		// scanner class object
        Scanner sc = new Scanner(System.in);

        //takes the size of the array as input from the user. 
        System.out.print("Enter the size of the array: ");
        
        //integer input from the user.
        int size = sc.nextInt();
        int[] numbers = new int[size]; 
        int sum=0;

        //prompt the user to enter elements of the array.
        System.out.println("Enter " + size +" elements of the array: ");
        for (int i = 0; i < size; i++)
        {
            numbers[i] = sc.nextInt();
        }
        
        //Calculate and display the average of all elements in the array of doubles.
		for(int i=0;i<size;i++)
		{
			sum +=numbers[i];
		}
		double average = sum / numbers.length;
		System.out.println("The average of all " + size + " elements in the array is: " + average);
		sc.close();

	}

}
