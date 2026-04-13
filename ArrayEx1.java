package Encapsulation;

import java.util.ArrayList;

public class ArrayEx1 
{
   public static void main(String[]args)
   {
	   ArrayList<String> list  = new ArrayList<>();
	   ArrayList<Integer> list2 = new ArrayList<>();
	   list2.add(1);
	   list2.add(2);
	   list2.add(3);
	   list.add("java");
	   list.add("python");
	   list.add("c++");
	   
	   System.out.println(" Elements : "+list);
	   
	   list.remove("java");
	   
	   System.out.println("Elements : "+list);
	   System.out.println("Numbers are : "+list2);
   }
}
