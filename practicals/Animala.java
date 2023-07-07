package oops;
//Example of Abstraction
abstract class Animala
{
	//contains abstract method
	//Abstract method does not have body
	public abstract void sound();
	
	//can contain non abstract method
	public void sleep()
	{
		System.out.println("Animals sleep....");
	}	
}

//subclass inherits Animals
class Monkey extends Animala
{
	public void sound()
	{
		System.out.println("Monkey sound like human.....");
	}	
}

class AnimalaMain
{
	public static void main(String[] args)
	{
		//creating object of sub class
		Monkey m=new Monkey();
		m.sleep();
		m.sound();

	}

}