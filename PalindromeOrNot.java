package Encapsulation;

public class PalindromeOrNot 
{
    public static void main(String[]args)
    {
    	String str = "AAA";
    	String rev = new StringBuilder(str).reverse().toString();
    	
    	System.out.println(str.equals(rev)? " palindrome ":" Not ");
    	
    }
}
