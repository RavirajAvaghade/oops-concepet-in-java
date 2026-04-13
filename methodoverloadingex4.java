package Encapsulation;

class Calculator1
{
	int sub(int a, int b)
	{
		return a-b;
	}
	int sub(int a,int b, int c)
	{
		return a-b-c;
	}
}
public class methodoverloadingex4 
{
   public static void main(String[]args)
   {
	   Calculator1 C = new Calculator1();
	   System.out.println("Sub1 is : "+C.sub(10, 5));
	   System.out.println("Sub2 is : "+C.sub(10, 5,5));
   }
}
