package Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayEx3 
{
  public static void main(String[]args)
  {
	  ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,2,2,3,4,5));
	  
	  HashSet<Integer> set = new HashSet<>(list);
	  
	  System.out.println("Without duplicates : "+list);
  }
}
