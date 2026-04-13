package Encapsulation;
class calculator
{
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
public class MethodOverloadingEx3 
{
  public static void main(String[]args)
  {
	  calculator c = new calculator();
	  System.out.println("Sum1 is : "+c.add(10, 20));
	  System.out.println("Sum2 is :" +c.add(10, 20,30));
  }
}
