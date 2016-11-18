import java.util.Scanner;
public class JPQbubbleSort
{
	public static void main(String[] args)
	{
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the array elements");
		int a[] = new int[10];
		int b;
		for(int i=0;i<a.length;i++)
		{
			a[i] = ab.nextInt();			
		}
		System.out.println("Enter option for sorting,\n1. Ascending Order\n2. Descending Order");
		int sort = new Scanner(System.in).nextInt();
		System.out.println("Array before sorting ");
		for(int X: a)
		{
			System.out.print(X+"\t");
		}		
		System.out.println("\nSorted Array is ");
		for (int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(sort==1)
				{
					if(a[j-1]>a[j])
					{
						b = a[j-1];
						a[j-1] = a[j];
						a[j] = b;
					}
				}
				else if (sort==2)
				{
					if(a[j-1]<a[j])
					{
					b = a[j-1];
					a[j-1] = a[j];
					a[j] = b;
					}
				}
				else
				{
					System.out.println("Entered option is not valid");
				}				
			}				
		}
		for(int Q: a)
		System.out.print(Q+"\t");
	}
}