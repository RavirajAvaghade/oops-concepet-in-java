package Encapsulation;
class Employee
{
	private int id;
	private String name;
	private int salary;
	
	public int getID()
	{
		return id;
	}
    public void setID(int id)
    {
    	this.id = id;
    }
    public String getNAME()
    {
    	return name;
    }
    public void setNAME(String name)
    {
    	this.name = name;
    }
    public int getSALARY()
    {
    	return salary;
    }
    public void setSALARY(int salary)
    {
    	this.salary= salary;
    }
}
public class Example4 
{
    public static void main(String[]args)
    {
       Employee E = new Employee();
       E.setID(101);
       E.setNAME("Raj");
       E.setSALARY(25000);
       System.out.println(E.getID()+" "+E.getNAME()+" "+E.getSALARY());
    }
}
