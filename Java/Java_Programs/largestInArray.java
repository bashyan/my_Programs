import java.util.Scanner;
public class largestInArray
{
	public static void main(String[] args)
	{
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the array elements");
		int a[] =  new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i] = ab.nextInt();
		}
		int largest=a[0], smallest=a[0];
		for (int i=1;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest = a[i];
			}
			else if(a[i]<smallest)
			{
				smallest = a[i];
			}			
		}
		System.out.println("Largest is "+largest+" \nSmallest is "+smallest);
	}
}