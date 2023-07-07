package oops;
//Example of polymorphism 1.Method Overloading
public class Polymorphism 
{
	// 1.Method Overloading
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int sub(int a,int b,int c)
	{
		return a-b-c;
	}
	public double sub(double a,double b)
	{
		return a-b;
	}	
}
class PolymorphismExMain
{
	public static void main(String[] args) 
	{
		Polymorphism p =new Polymorphism();
		System.out.println("The Subtraction is : " +p.sub(20, 100));
		System.out.println("The Subtraction is : " +p.sub(10, 20, 30));
		System.out.println("The Subtraction is : " +p.sub(10.25, 10.23));
	}
}
