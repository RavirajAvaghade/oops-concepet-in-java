package Encapsulation;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionEx7 
{
   public static void main(String[]args)
   {
	   try
	   {
		   FileWriter fw = new FileWriter("test.txt");
		   fw.write("hello world");
		   fw.close();
	   }
	   catch(IOException  e)
	   {
		   System.out.println("IOException Occured");
	   }
   }
}
