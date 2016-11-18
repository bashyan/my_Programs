import java.util.Scanner;
public class JPQbinaryNumber
{
	public static void main(String[] qwe)
	{
		System.out.println("Enter the digit");
		int a = new Scanner(System.in).nextInt();
		int count = 1, n = a, b=0, c=0, d=0;
		boolean binary = false;
		while((n=n/10)!=0)
		{
			count++;
		}
		int arr[] = new int[count];
		for(int i=0;i<count;i++)
		{
			b = a/10;
			c = a%10;
			a = b;
			arr[i] = c;							
		}
		for(int i=0;i<count;i++)
		{
			if(arr[i]==1 || arr[i]==0)
			{
				
			}
			else
			{
				d++;
			}
		}
		if(d!=0)
		{
			System.out.println("The given number is NOT binary");
		}
		else
		{
			System.out.println("The given number is Binary");
		}
	}
}