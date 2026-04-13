//ArrayindexoutofboundException 
package Encapsulation;

public class ExceptionEx4 
{
   public static void main(String[]args)
   {
	   try
	   {
		   int arr[] = {1,2,3};
		   System.out.println(arr[5]);
	   }
	   catch(ArrayIndexOutOfBoundsException e)
	   {
		   System.out.println("Invalid Index");
	   }
	   finally
	   {
		   System.out.println("Finally block will executes ");
	   }
   }
}
