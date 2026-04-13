package Encapsulation;

import java.util.ArrayList;

public class ArrayEx4 
{

	public static void main(String[] args) 
	{
      ArrayList<String> list = new ArrayList<>();
      list.add("Apple");
      list.add("Banana");
      list.add("Mango");
      
      System.out.println("List : "+list);
      System.out.println("First item : "+list.get(0));
	}

}
