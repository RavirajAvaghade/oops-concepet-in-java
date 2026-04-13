package Encapsulation;

class Animal1
{
	void sound()
	{
		System.out.println("Animal making sound");
	}
}
class Dog1 extends Animal1
{
   void bark()
   {
	   System.out.println("Dog Barks");
   }
}
class cat1  extends Animal1
{
	void meow()
	{
		System.out.println(" cat make sound meow");
	}
}
public class InheritanceEx1 
{

	public static void main(String[] args) 
	{
        Dog1 D = new Dog1();
        D.sound();
        D.bark();
        
        cat1 c = new cat1();
        c.sound();
        c.meow();
	}

}
