package oops;
//Example of Multilevel inheritance
//super class or base class or parent class
public class Animals 
{
	  //fields & methods
		String name;
		public void eat()
		{
			System.out.println("Animal Eat....");
		}
}
//inherit from Animal class
class Dogs extends Animals
{
	//fields & methods of Animal class
	//fields & methods of Dog class
	public void sound()
	{
		System.out.println("Dog Barks....");
	}
}
class Puppy extends Dogs
{
	//fields & methods of Animal class
	//fields & methods of Dog class
	//fields & methods of Puppy class
		public void colour()
		{
			System.out.println("Black & white....");
		}
}
class AnimalsMain
{
	public static void main(String[] args)
	{
		//creating object of sub class
		Puppy d=new Puppy();
		
		//access fields and methods
		d.name="Tomy";
		System.out.println("Name is: "+d.name);
		d.eat();
		d.sound();
		d.colour();
	}

}


