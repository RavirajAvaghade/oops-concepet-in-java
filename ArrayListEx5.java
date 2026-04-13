package Encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx5
{
   public static void main(String[]args)
   {
	   Scanner sc = new Scanner(System.in);
	   ArrayList<String> list = new ArrayList<>();
	   for(int i=0; i<=5; i++)
	   {
		   list.add(sc.nextInt(), null);
	   }
	   for(String n : list) {
           System.out.println(n);
       }
   }
}
