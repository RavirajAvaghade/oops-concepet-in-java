package Encapsulation;
class Samsung
{
   void Company()
   {
	   System.out.println("Samsung");
   }
}
class Mobile extends Samsung
{
	void Pname()
	{
		System.out.println(" Samsung s25 ultra ");
	}
}
class Fridge extends Samsung
{
	void Price()
	{
		System.out.println(" Rs:15,788 ");
	}
}
class TV extends Samsung
{
	void display()
	{
		System.out.println("4K Ultra HD Display");
	}
}
public class InheritanceEx2 
{
   public static void main(String[]args)
   {
	   Mobile M = new Mobile();
	   M.Company();
	   M.Pname();
	   
	   
	   Fridge F = new Fridge();
	   F.Company();
	   F.Price();
	   
	   TV T = new TV();
	   T.Company();
	   
	   
   }
}
