package Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx 
{
    public static void main(String[]args)
    {
    	List<Object> list = new ArrayList<>();
    	
    	while(true)
    	{
    		list.add(new byte[1024 * 1024]);
    	}
    	
    }
}
