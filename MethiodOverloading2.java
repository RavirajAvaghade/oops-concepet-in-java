package Encapsulation;
class Maths
{
	int sub(int a, int b)
	{
		return a - b;
	}
	int sub(int a,int b,int c, int d)
	{
		return a-b-c-d;
	}
}
public class MethiodOverloading2 
{

	public static void main(String[] args)
	{
       Maths M = new Maths();
       System.out.println(M.sub(10, 8));
       System.out.println(M.sub(100, 100, 200 , 100 ));
	}

}
