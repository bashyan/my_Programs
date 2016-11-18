import java.util.Scanner;
public class JPQperfect
{
	public static void main(String[] qwe)
	{
		System.out.println("Enter the number");
		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();
		int divisor=1,a;
		int p=0;
		System.out.println("Divisors of "+n+" is");
		for(int i=0;i<n-1;i++)
		{
			a = n%divisor;
			
			if(a==0)
			{
				System.out.println(divisor);
				p = p + divisor;
				divisor++;
			}	
			else
			{
				divisor++;
			}			
		}
		if(p == n)
				{
					System.out.println("Given number "+n+" is a perfect number");
				}
				else
				{
					System.out.println("Given number "+n+" is not a perfect number");
				}
	}
}