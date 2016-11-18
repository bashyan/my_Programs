import java.util.Scanner;
public class JPQsumOfDigits
{
	public static void main(String[] qwe)
	{
		System.out.println("Enter the digit");
		int a = new Scanner(System.in).nextInt();
		int count = 1, n = a, b=0, c=0, q=0;
		while((n=n/10)!=0)
		{
			count++;
		}
		int arr[] = new int[count];
		int add[] = new int[count];
		for(int i=0;i<count;i++)
		{
			b = a/10;
			c = a%10;
			a = b;
			arr[i] = c;			
		}
		q = arr[0];
		for(int i=1;i<count;i++)
		{
			q = q + arr[i];
		}
		System.out.println(q);		
	}
}