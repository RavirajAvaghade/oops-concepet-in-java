package Encapsulation;

import java.util.Stack;

public class StackEx1 
{
   public static void main(String[]args)
   {
	   Stack<String> name = new Stack<>();
	   name.push("java");
	   name.push("python");
	   name.push("c++");
	   
	   System.out.println(" Name : "+name);
	   
	   System.out.println(name.pop());
	   System.out.println(name.push("Html"));
	   
   }
}
