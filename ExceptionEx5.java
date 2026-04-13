//Number Format Exception 
package Encapsulation;

public class ExceptionEx5
{
    public static void main(String[]args)
    {
    	try
    	{
    		int num = Integer.parseInt("abc");
    	}
    	catch(NumberFormatException e)
    	{
    		System.out.println("Invalid Number Format ");
    	}
    }
    
}
