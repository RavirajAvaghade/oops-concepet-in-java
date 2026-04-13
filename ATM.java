package Encapsulation;

import java.util.Scanner;

public class ATM 
{
   public static void main(String[]args)
   {
	   Scanner sc = new Scanner(System.in);
	   int balance = 10000;
	   int withdraw;
	   int deposit;
	   
	   System.out.println("ATM Machine");
	   
	   while(true)
	   {
		   System.out.println("\n1 check Balance ");
		   System.out.println("2.Withdraw Money");
		   System.out.println("3.Deposite Money ");
		   System.out.println("4.Exit");
		   
		   System.out.println("Enter Your Choice : ");
		   int choice = sc.nextInt();
		   
		   switch(choice)
		   {
		   case 1:
			   System.out.println(" Your Balance : "+balance);
			   break;
			   
		   case 2:
			   System.out.println(" Enter amount to withdraw");
			   withdraw = sc.nextInt();
			   
			   if(withdraw%100!=0)
			   {
				   System.out.println("Amount Should be Multiple To 100 ");
				   
			   }
			   else if(withdraw>balance)
			   {
				   System.out.println("insuffeciant balance");
			   }
			   else
			   {
				 balance = balance - withdraw;
				 System.out.println("please collect Your Cash");
				 System.out.println("Your balance : "+balance);
			   }
			   break;
		   case 3:
			    System.out.print("Enter amount to deposit: ");
			    deposit = sc.nextInt();

			    if(deposit <= 0)
			    {
			        System.out.println("Enter valid amount");
			    }
			    else
			    {
			        balance = balance + deposit;   // 🔥 main line
			        System.out.println("Deposit successful ✅");
			        System.out.println("Updated Balance: " + balance);
			    }
			    break;
			   
			   
		   case 4:
			   System.out.println("Thank You For Using ATM");
			   System.exit(0);
		   
		   
			   default:
				   System.out.println("Invalid Choice ");
		   }
	   }
   }
}
