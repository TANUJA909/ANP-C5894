package loops;
//Program that calculates and prints the sum of all numbers from user input
import java.util.Scanner;
public class SumOfNumbers 
{
	public static void main(String[] args) 
	{
		//Scanner class object
		Scanner s=new Scanner(System.in);
		
		//input from user
		System.out.println("Enter the number of values to sum: ");
		
		 //integer input
		int count=s.nextInt();
		int sum=0;
		
		for(int i=1;i<=count;i++)
		{
			System.out.println("Enter value #" + i + ": ");
			int val=s.nextInt();
			sum +=val;
		}
		
		System.out.println("The sum of all " + count + " numbers is: " + sum);
		
		s.close();
	}
}
