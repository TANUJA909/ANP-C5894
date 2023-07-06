package oops;
//Example of Single level inheritance
//super class or base class or parent class
public class Shape {
	//fields & methods
	public void calculateArea()
	{
		System.out.println("Calculate area of shape");
	}

	

}
//inherit from Shape
class Rectangle extends Shape
{
	//fields & methods Shape class
	//fields & methods of Rectangle class
	@Override
	public void calculateArea()
	{
		
		System.out.println("Calculate area of Rectangle");
	}
}

class ShapeMain
{
	public static void main(String[] args) {
		// creating object of sub class
		Rectangle r=new Rectangle();
		//access fields & methods
		r.calculateArea();

	}
		
}