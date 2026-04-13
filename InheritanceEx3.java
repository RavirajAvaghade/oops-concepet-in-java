package Encapsulation;
abstract class A
{
	abstract void show();
	
}
class B extends A
{

	@Override
	void show() 
	{
		System.out.println("Employee details ");
	}
	
}
public class InheritanceEx3 
{
   public static void main(String[]args)
   {
      B b = new B();
      b.show();
   }
}
