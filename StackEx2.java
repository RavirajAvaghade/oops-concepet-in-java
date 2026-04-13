package Encapsulation;

import java.util.Stack;

public class StackEx2
{
   public static void main(String[]args)
   {
	   Stack<Integer> name = new Stack<>();
	   name.push(10);
	   name.push(20);
	   name.push(30);
	   name.remove(1);
   
	   System.out.println(" Satck : "+name);
	   System.out.println("Top element : "+ name.peek());
	   System.out.println("Removed "+name.pop());
   }
}
