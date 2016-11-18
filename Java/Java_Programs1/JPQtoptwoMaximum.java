import java.util.Scanner;
public class JPQtoptwoMaximum
{
	public static void main(String[] qwe)
	{		
		System.out.println("Enter 7 integers");		
		Scanner ab = new Scanner(System.in);
		int a[] = new int[7];
		for(int i=0;i<7;i++)
		{
			a[i] = ab.nextInt();
		}
		int maximum = Integer.MIN_VALUE, secondMaximum = Integer.MIN_VALUE;
		for(int i=0;i<7;i++)
		{
			if(a[i]>maximum)
			{
				secondMaximum = maximum;
				maximum = a[i];
			}
			else if (a[i]>secondMaximum)
			{
				secondMaximum = a[i];
			}
		}
		System.out.println("Top 2 maximum intergers are "+maximum+","+secondMaximum);				
	}
}