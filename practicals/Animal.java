package oops;
//Example of Single level inheritance
//super class or base class or parent class
public class Animal
{
	//fields & methods
	String name;
	public void eat()
	{
		System.out.println("Animal eat");
	}
}
//inherit from Animal
class Dog extends Animal
{
	//fields & methods Animal class
	//fields & methods of Dog class
	public void soumd()
	{
		System.out.println("Dog barks....");
	}
}
class AnimalMain
{
	public static void main(String[] args) 
	{
		// creating object of sub class
		Dog d=new Dog();
		
		//access fields & methods
		d.name="Moti";
		System.out.println("Name is: "+d.name);
		d.eat();
		d.soumd();
	}
}