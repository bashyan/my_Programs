import java.util.*;
public class numstr
{
public static void main(String[] args)
	{
	char[] num={'A','B','C'};
	int i0=Character.getNumericValue(num[0]);
	System.out.println(i0);

	String s=Integer.toHexString(255);
	System.out.println("Hex value of 255 is "  + s);
	String s1=Integer.toOctalString(255);
	System.out.println("Oct value of 255 is "  +s1);

	Double d = new Double("3.14");
	System.out.println("d = "+ d.toString() ); 
        	String  s2 = Double.toString(3.14);

	char[] num1={'F'};
	int a0= Integer.parseInt(num1[0]); 
	}
}