package Encapsulation;

public class PalindromeNumber 
{
  public static void main(String[]args)
  {
	  int n = 122,temp = n, rev=0;
	  
	  while(n>0)
	  {
		  int rem = n%10;
		  
		  rev = rev*10+rem;
		  n /=  10;
	  }
	  System.out.println(temp==rev);
	   
  }
}
