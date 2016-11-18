import java.util.Scanner;
public class JPQmagicNumber
{
	public static int count=1, c=0;
	public static int d,f,t;
	public int noOfDigits(int d)
	{
		int n = d;
		count = 1;
		while((n=n/10)!=0)
		{
			count++;
		}
		System.out.println("Number of Digits "+count);
		return count;
	}
	public int addDigits(int f)
	{
		int z=0;
		while(f!=0)
		{
			int b = f/10;			
			c = f%10;
			f = b;
			z = z + c;
		}		
		System.out.println("Sum of Digits "+z);
		t = z;
		return t;
	}
	public static void main(String[] qwe)
	{
		JPQmagicNumber obj = new JPQmagicNumber();
		System.out.println("Enter the number");
		int a = new Scanner(System.in).nextInt();
		t = a;
		while(t>9)
		{
			obj.noOfDigits(t);
			obj.addDigits(t);
		}		
		if(t==1)
		{
			System.out.println("The Number "+a+" is Magic Number");
		}
		else
		{
			System.out.println("The Number "+a+" is NOT a Magic Number");
		}
	}
}