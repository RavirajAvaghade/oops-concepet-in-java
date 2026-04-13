package Encapsulation;
abstract class Animal
{
	abstract void sound();
	
	void species()
	{
		System.out.println("this are animal world");
	}
}
class Dog extends Animal
{

	void color()
	{
		System.out.println("red");
	}
	@Override
	void sound()
	{
		System.out.println(" Dog is Barking");
	}
	
}
class Cat extends Animal
{

	void color()
	{
		System.out.println("white");
	}
	@Override
	void sound() 
	{
		System.out.println("Cat is making sound meow");
	}
	
}
public class AbstractionEx1 
{

	public static void main(String[] args) 
	{
      Dog D = new Dog();
      D.color();
      D.sound();
      D.species();
      
      
      Cat c = new Cat();
      c.color();
      c.sound();
      c.species();
	}

}
