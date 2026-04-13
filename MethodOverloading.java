package Encapsulation;

class math
{
	int add(int a,int b)
	{
		return a + b;
	}
	int add(int a,int b, int c)
	{
		return a+b+c;
	}
}
public class MethodOverloading
{

	public static void main(String[] args) 
	{
        math m = new math();
        System.out.println(m.add(20, 10));
        System.out.println(m.add(19, 20,22));
	}

}
