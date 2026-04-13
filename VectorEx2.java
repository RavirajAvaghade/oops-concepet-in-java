package Encapsulation;

import java.util.Vector;

public class VectorEx2 
{
   public static void main(String[]args)
   {
	   Vector<Number> number = new Vector<>();
	   number.add(10);
	   number.add(20);
	   number.add(30);
	   
	   System.out.println(" First Element : "+number.get(0));
	   
	   number.set(0, 50);
	   number.set(1, 100);
	   
	   number.remove(2);
	   
	   System.out.println(number);
	  
   }
}
