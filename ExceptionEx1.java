package Encapsulation;

import java.util.Scanner;

public class ExceptionEx1 
{

	public static void main(String[] args) 
	{
         try
         {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter First Number : ");
        	int a = sc.nextInt();
        	System.out.println("Enter Second Number : ");
        	int b = sc.nextInt();
        	int c = a/b;
         }
         catch(ArithmeticException e)
         {
        	 System.out.println("Can Not Divided by zero ");
         }
         finally
         {
        	 System.out.println("finally block always executes ");
         }
	}

}
