import java.util.Arrays;
import java.util.Scanner;
public class JPQbinarySearch
{
	public static void main(String qwe[])
	{
		Scanner ab = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter 10 elements");
		for(int i=0;i<10;i++)
		{
			a[i] = ab.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Sorted Array ");
		for(int A: a)
		{
			System.out.print(A+"\t");
		}
		System.out.println("\nEnter element to search");
		int ele = new Scanner(System.in).nextInt();
		int i=0,count=0, count1=0,index=0;		
		for(int Q: a)
		{
			if(a[i]==ele)
			{
				index = Arrays.binarySearch(a, ele);
				count1++;		
			}
			else
			{
				count++;
			}
			i++;
		}
		if(count1==1)
		{
			System.out.println("The element "+ele+" is located in "+(index+1)+" index");
		}
		if(count!=9)
		{
			System.out.println("Element not found");
		}
	}
}