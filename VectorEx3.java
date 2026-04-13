package Encapsulation;

import java.util.Vector;

public class VectorEx3
{
   public static void main(String[]args)
   {
	   Vector<String> name = new Vector<>();
	   name.add("Ravi");
	   name.add("Amit");
	   name.add("neha");
	   name.add("pooja");
	   
	   System.out.println("Names in vector : ");
	   
	   for(int i=0; i<name.size(); i++)
	   {
		   System.out.println(i);
	   }
   }
}
