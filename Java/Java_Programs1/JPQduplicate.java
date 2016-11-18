import java.util.Scanner;
public class JPQduplicate
{
	public static void main(String[] arg)
	{
		System.out.println("Enter the number N");
		Scanner ab = new Scanner(System.in);
		long n = ab.nextLong();
		System.out.println("N is "+n);
		int count = 1;
		long p = n;
		while((p=p/10)!=0)
		{
			count++;			
		}
		long arr[] = new long[count];
		for(int i=0;i<count;i++)
		{
			long a = n/10;
			long b = n%10;
			n = a;
			arr[i] = b;
			System.out.println(arr[i]);
		}
		for(int q=0;q<count;q++)
		{
			for(int w=q+1;w<count;w++)
			{
				if(arr[q]==arr[w])
				{
					System.out.println("Duplicate element is "+arr[q]);
				}
			}
		}		
	}
}