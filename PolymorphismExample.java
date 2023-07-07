package oops;
//Example of polymorphism
public class PolymorphismExample 
{
	// 2 types
   // 1.Method Overloading/Compiletime polymorphism(same method name with different parameters & return type)
	//2.Method Overriding/Runtime polymorphism (inheritance concept)
	public int sum(int a,int b)
	{
		return a+b;
	}
	public int sum(int a,int b,int c)
	{
		return a+b+c;
	}
	public double sum(double a,double b)
	{
		return a+b;
	}
}
class PolymorphismMain
{
	public static void main(String[] args)
	{
		
		PolymorphismExample p =new PolymorphismExample();
		System.out.println("The sum is : " +p.sum(10,20));
		System.out.println("The sum is : " +p.sum(10, 20, 30));
		System.out.println("The sum is : " +p.sum(10.25, 10.23));

	}
}

