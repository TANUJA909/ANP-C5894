package oops;
//Create an abstract class called Shape.
public abstract class Shapes 
{
	//contains abstract method
	//Abstract method does not have body
	//It should have abstract methods calculateArea() and calculatePerimeter().
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
}
//Create three concrete classes Rectangle, Circle, and Triangle that extend the Shape class.
// Implement the calculateArea() and calculatePerimeter() methods in each subclass based on their specific formulas.
class Rectangles extends Shapes 
{
	int l=2;
	int b=3;
	int a;
	int p;
	public void calculateArea()
	{
		a=l*b;
		System.out.println("Area of Rectangle: "+a);
	}
	public void calculatePerimeter()
	{
		p=2*(l+b);
		System.out.println("Perimeter of Rectangle: "+p);
	}
}

class Circle extends Shapes
{
	double r=5;
	double pi=3.14;
	double a;
	double p;
	public void calculateArea()
	{
		a=pi*r*r;
		System.out.println("Area of Circle: "+a);
	}
	public void calculatePerimeter()
	{
		p=2*pi*r;
		System.out.println("Perimeter of Circle: "+p);	
	}	
}

class Triangle extends Shapes
{
	int a=2;
	int b=55;
	int c=2;
	int h=3;
	double area;
	int p;
	public void calculateArea()
	{
		area=(0.5)*b*h;
		System.out.println("Area of Triangle: "+area);
	}
	public void calculatePerimeter()
	{
		p=a+b+c;
		System.out.println("Perimeter of Triangle: "+p);
	}
}

class ShapesMain
{
	public static void main(String[] args) 
	{
		//Create instances of Rectangle, Circle, and Triangle and calculate their respective areas and perimeters
		Rectangles r= new Rectangles();
		r.calculateArea();
		r.calculatePerimeter();
		
		Circle c=new Circle();
		c.calculateArea();
		c.calculatePerimeter();
		
		Triangle t= new Triangle();
		t.calculateArea();
		t.calculatePerimeter();
	}
}