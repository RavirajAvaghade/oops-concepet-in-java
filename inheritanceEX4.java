package Encapsulation;

class Person1
{
   public String name;
   public int age;
   public Person1(String name,int age)
   {
	   this.name = name;
	   this.age = age;
   }
   public void displayperson()
   {
	   System.out.println("Name : "+ name);
	   System.out.println("Age  : "+ age);
   }
}
class Employee1 extends Person1
{
   public int id;
   public double salary;
   public Employee1(String name,int age,int id,double salary)
   {
	   super(name,age);
	   this.id = id;
	   this.salary = salary;
   }
   void displayemloyee()
   {
	   System.out.println("Employee ID : "+id);
	   System.out.println("Salary      : "+salary);
   }
}
class Student2 extends Person1
{
	public int rollno;
	public int marks;
	public Student2(String name,int age,int rollno,int marks)
	{
		super(name,age);
		this.rollno = rollno;
		this.marks = marks;
	}
	void displaystudent()
	{
		System.out.println(" Roll No : "+rollno);
		System.out.println(" Marks   : "+marks);
	}
}
public class inheritanceEX4 
{
   public static void main(String[]args)
   {
	   System.out.println("====================");
	   System.out.println("person");
	   Person1 P = new Person1("Ramu", 33);
	   P.displayperson();
	   System.out.println("=====================");
	   System.out.println("Employee");
	   Employee1 E = new Employee1("Raj",22,101,22333);
	   E.displayperson();
	   E.displayemloyee();
	   System.out.println("=====================");
	   System.out.println("Student");
	   Student2 S = new Student2("Raj",17,22,95);
	   S.displayperson();
	   S.displaystudent();
	   System.out.println("=====================");
   }
}
