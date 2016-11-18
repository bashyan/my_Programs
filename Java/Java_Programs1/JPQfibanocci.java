import java.util.Scanner;
public class JPQfibanocci
{
	public static void main(String[] qwe)
	{
		System.out.println("Enter number of series");
		Scanner ab = new Scanner(System.in);
		int series = ab.nextInt();
		int a = 0, b = 1, c = 1;
		System.out.println("Fibanocci Series of "+series+" sequence is ");
		System.out.print(a+"\t"+b+"\t"+c+"\t");
		for(int i=0;i<series-3;i++)
		{
			a = b;
			b = c;
			c = a+b;
			System.out.print(c+"\t");
		}
	}
}