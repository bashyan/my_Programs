import java.util.Scanner;
public class JPQfloydTriangle
{
	public static void main(String[] qwe)
	{
		System.out.println("Enter number of lines");
		int lines = new Scanner(System.in).nextInt();
		int k = 1;
		System.out.println("Floyd Triangle of "+lines+" rows");
		for(int i=1;i<lines+1;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(k+"\t");
				k++;
			}
			System.out.println("");
		}
	}
}