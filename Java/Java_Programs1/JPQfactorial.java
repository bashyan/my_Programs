import java.util.Scanner;
public class JPQfactorial
{
	public static void main(String[] qwe)
	{
		System.out.println("Enter the factorial series");
		int a = new Scanner(System.in).nextInt();
		int b = 1;
		for(int i=a;i>0;i--)
		{
			b = b * i;
		}
		System.out.print(b);
	}
}