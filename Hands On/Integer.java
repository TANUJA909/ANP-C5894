package loops;
/*Write a Java program that takes an integer as input and checks if it is positive or negative.
 Print "Positive" if the number is greater than 0,
  and "Negative" if it is less than 0.
*/
import java.util.Scanner;
public class Integer 
{
	public static void main(String[] args) {
		// takes an integer as input 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a=s.nextInt();
		//checks if it is positive or negative. 
		if(a>0)
		{
			//Print "Positive" if the number is greater than 0
			System.out.println("The number entered is Positive");
		}
		else if(a<0)
		{
			//Print "Negative" if it is less than 0.
			System.out.println("The number entered is Negative");
		}
		//if not satisfies all the conditions
		else
		{
			System.out.println("The number entered is zero");
		}
		s.close();
	}
}
