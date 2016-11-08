/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MRuser
 */
public class exceptionHandling 
{
    static void handling()
		{
		int a = 3;
		int b = 0;
		try
			{
			b = a/b;
			}
		catch (ArithmeticException e)
			{
			System.out.println(b);
			}
		finally
			{
			System.out.println("error");
			}
		System.out.println("end");
		}

    static void array()
                {
                String a1[] = {"a","b","c","d","e","f"};
                String a = "";
              try
                  {
                    for(int i = 0; i<a1.length+1;i++)
                    {
			a1[i] = a;
                    }
               }
               catch(ArrayIndexOutOfBoundsException e)
               {
                    System.out.println("index value is less than length");
                }
		}
    static void nullpointer()
    {
        int a;
        try
        {
            a = a++;
        }
        catch(Exception g)
        {
        System.out.println("nullpointererror");
        }
    }
    public static void main(String str[])
		{
		
		array();
                handling();
                nullpointer();
		}
    
}
