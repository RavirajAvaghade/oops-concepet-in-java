package Encapsulation;

import java.util.HashSet;

public class HashSetExs 
{
   public static void main(String[]args)
   {
	   
       HashSet<Integer> set = new HashSet<>();
       set.add(10);
       set.add(20);
       set.add(30);
       set.add(10); // duplicates are not allowed here 
       
       System.out.println(set);
   }
}
