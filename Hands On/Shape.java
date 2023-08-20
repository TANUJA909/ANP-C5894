/*
Thursday Lab
Question 3: Create a superclass called "Shape" with properties like "numSides" and "color". 
Create three subclasses "Triangle", "Square", and "Circle" that inherit from "Shape" 
and have additional properties like "sideLengths" for triangle and square, and "radius" for the circle. 
Write a Java program to display the details of a triangle, a square, and a circle. 
*/

//Create a superclass called "Shape" 
public class Shape 
{
	// Properties like "numSides" and "color"
	int numSides;
	String color;
}

//Create three subclasses "Triangle", "Square", and "Circle" that inherit from "Shape" 
//and have additional properties like "sideLengths" for triangle and square, and "radius" for the circle. 
class Triangle extends Shape
{
	int sideLengths;
}

class Square extends Shape
{
	int sideLengths;
}

class Circle extends Shape
{
	int radius;
}

//display the details of a triangle, a square, and a circle. 
class ShapeMain
{
	public static void main(String[] args) 
	{
		//creating object of sub class Triangle
		Triangle t=new Triangle();
		//access properties
		t.numSides=3;
		t.color="Pink";
		t.sideLengths=6;
		//Print value
		System.out.println("Details of a Triangle: ");
		System.out.println("Number of sides of a Triangle: " + t.numSides);
		System.out.println("The color of the Triangle: " + t.color);
		System.out.println("The length of the sides of a Triangle: " + t.sideLengths);
		System.out.println();
		
		//creating object of sub class Square
		Square s=new Square();
		//access properties
		s.numSides=3;
		s.color="Yellow";
		s.sideLengths=5;
		//Print value
		System.out.println("Details of a Square: ");
		System.out.println("Number of sides of a Square: " + s.numSides);
		System.out.println("The color of the Square: " + s.color);
		System.out.println("The length of the sides of a Square: " + s.sideLengths);
		System.out.println();
		
		//creating object of sub class Circle
		Circle c=new Circle();
		//access properties
		c.numSides=3;
		c.color="Blue";
		c.radius=4;
	
		//Print value
		System.out.println("Details of a Circle: ");
		System.out.println("Number of sides of a Circle: " + c.numSides);
		System.out.println("The color of the Circle: " + c.color);
		System.out.println("The length of the radius of a Circle: " + c.radius);
		
		
		
		
		
	}
}
