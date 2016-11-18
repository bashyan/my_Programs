import java.util.Scanner;
public class JPQreverse
{
	public static void main(String[] arg)
	{
		System.out.println("Enter the number");
		Scanner ab = new Scanner(System.in);
		long n = ab.nextLong();
		System.out.println("Entered number is "+n);
		int count = 1;
		long p = n;
		while((p=p/10)!=0)
		{
			count++;			
		}
		long arr[] = new long[count];
		System.out.print("Reverse number is ");
		for(int i=0;i<count;i++)
		{
			long a = n/10;
			long b = n%10;
			n = a;
			arr[i] = b;
			System.out.print(arr[i]);
		}
	}
}