package Encapsulation;
class student1
{
	private int id;
	private int rollno;
	private String name;
	private double marks;
	
	public int getID()
	{
		return id;
	}
	public void setID(int id)
	{
		this.id = id;
	}
	public int getROLLNO()
	{
		return rollno;
	}
	public void SetROLLNO(int rollno)
	{
		this.rollno = rollno;
	}
	public String getNAME()
	{
		return name;
	}
	public void setNAME(String name)
	{
		this.name = name;
	}
	public double getMARKS()
	{
		return marks;
	}
	public void setMARKS(double marks)
	{
		this.marks = marks;
	}
}
public class Example5 
{
   public static void main(String[]args)
   {
	   student1 S = new student1();
	   S.setID(101);
	   S.setMARKS(90);
	   S.setNAME("RAj");
	   S.SetROLLNO(221);
	   
	   System.out.println(S.getID()+" "+S.getMARKS()+" "+S.getNAME()+" "+S.getROLLNO());
   }
}
