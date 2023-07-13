package loops;
//print sum of even numbers from 1 to 100
public class EvenNumbers {

	public static void main(String[] args) {
		//n initialized to 1
		int n=1;
		//sum initialized to 0
		int sum=0;
		//condition to check n is less than equal to 100
		while (n<=100)
		{
			//if condition to check even number
			if(n%2==0)
			{
				sum+=n;
			}
			//n is incremented by 1
			n++;;
		}
		//print sum of even numbers from 1 to 100
		System.out.println("Sum of even numbers: "+ sum);		
	}
}
