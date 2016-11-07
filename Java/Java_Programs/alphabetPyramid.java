import java.util.Scanner;
public class alphabetPyramid
{
	public static void main(String[] args)
	{
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int row = ab.nextInt();
		for(int i=row;i>0;i--)
		{
			for(int j=0;j<row-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=0;k<i;k++)
			{
				char a = (char) ('A' +k);
				System.out.print(a);
			}
			for(int x=i-2;x>-1;x--)
				{
				char b = (char) ('A' +x);
				System.out.print(b);
				}
			System.out.println(" ");
		}
	}
}