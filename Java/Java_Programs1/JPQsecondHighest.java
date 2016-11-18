import java.util.Scanner;
public class JPQsecondHighest
{
	public static void main(String[] qwe)
	{
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter 6 numbers");
		int[] a = new int[6];
		for(int i=0;i<6;i++)
		{
			a[i] = ab.nextInt();
		}		
		int largest = Integer.MIN_VALUE;
		int seclargest = Integer.MIN_VALUE;
		for(int i=0;i<6;i++)
		{
			if(a[i]>largest)
			{				
				seclargest = largest;
				largest = a[i];					
			}
			else if(a[i]>seclargest)
			{
				seclargest = a[i];					
			}
		}		
		System.out.println("Second Largest is "+seclargest);
	}
}