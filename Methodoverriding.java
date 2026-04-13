package Encapsulation;

class Animal22
{
	void sound()
	{
		System.out.println("Animal make sound");
	}
}
class Dog22 extends Animal22
{
	@Override
	void sound()
	{
		System.out.println("Dog barks");
	}
}
class cat22 extends Animal22
{
	@Override
	void sound()
	{
		System.out.println("cat meow");
	}
}
public class Methodoverriding 
{
   public static void main(String[]args)
   {
	   Animal22 A =new Animal22();
	   A.sound();
	   
	   Dog22 d = new Dog22();
	   d.sound();
	   
	   cat22 c = new cat22();
	   c.sound();
   }
}
