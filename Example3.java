package Encapsulation;
class Person
{
	private int id;
	private String name;
	private int age;
	private int salary;
	public int getID()
	{
		return id;
	}
	public void setID(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
}
public class Example3
{

	public static void main(String[] args)
	{
       Person p = new Person();
       p.setID(101);
       p.setAge(22);
       p.setName("Raj");
       p.setSalary(20000);
       
       System.out.println(p.getID()+" "+p.getAge()+" "+p.getName()+" "+p.getSalary());
	}

}
