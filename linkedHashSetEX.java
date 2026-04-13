package Encapsulation;

import java.util.LinkedHashSet;

public class linkedHashSetEX 
{
  public static void main(String[]args)
  {
	  LinkedHashSet<Integer> set = new LinkedHashSet<>();
	  set.add(10);
	  set.add(20);
	  set.add(30);
	  
	  set.remove(10);
	 	  System.out.println(set);
  }
}
