package Encapsulation;

public class ExceptionEx8 {
    public static void main(String[] args) 
    {
        try 
        {
            Thread.sleep(2000);
            throw new InterruptedException("Manual Exception ");
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Thread interrupted");
        }
    }
}
