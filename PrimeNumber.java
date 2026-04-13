package Encapsulation;

import java.util.Scanner;

public class PrimeNumber 
{
   public static void main(String[]args)
   {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a Number : ");
	  int a = sc.nextInt();
	  
	  if(a<=1)
	  {
		  System.out.println("Not prime return ");
		  return;
	  }
	     boolean isPrime = true;
	     
	     for(int i=2; i<=Math.sqrt(a); i++)
	     {
	    	 if(a%i==0)
	    	 {
	    		 isPrime = false;
	    		 break;
	    	 }
	     }
	     System.out.println(isPrime ? " Prime":"Not prime");
	     sc.close();
	     
   }
}
