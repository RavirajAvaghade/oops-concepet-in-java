// Throw Exception 
package Encapsulation;

import java.util.Scanner;

public class ExceptionEx6
{
    public static void main(String[]args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Your age : ");
    	int age = sc.nextInt();
    	try
    	{
    		if(age<18)
    		{
    			throw new ArithmeticException("You are Not Eligible For vote");
    		}
    		else
    		{
    			System.out.println("You are eligible for vote ");
    		}
    	}
    	catch(ArithmeticException e)
    	{
    		System.out.println(e.getMessage());
    	}
    	
    }
}
