package Encapsulation;

public class ExceptionEx3 
{
   public static void main(String[]args)
   {
	   try
	   {
		   String s = null;
		   System.out.println(s.length());
	   }
	   catch(NullPointerException e)
	   {
		   System.out.println("Null value Access");
	   }
	   finally
	   {
		   System.out.println("finally block always executes ");
	   }
   }
}
