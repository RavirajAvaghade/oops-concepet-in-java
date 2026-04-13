package Encapsulation;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx9 
{
	static void demo() throws IOException,ArithmeticException 
	{
		int a = 10/0 ;
		FileReader Fr = new FileReader("abc.txt");
	}
   public static void main(String[]args)
   {
	   try
	   {
		   demo();
	   }catch(Exception e)
	   {
		   System.out.println("Exception handled ");
	   }
   }
}
