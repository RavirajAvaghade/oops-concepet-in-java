package Encapsulation;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayEx2 
{
   public static void main(String[]args)
   {
	   LinkedList<String> list = new LinkedList<>();	   
	   list.add("A");
	   list.add("B");
	   list.add("C");
	   list.addFirst("first");
	   list.addLast("last");
	   
	   System.out.println(list);
   }
}
