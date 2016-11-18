import java.util.Scanner;
public class JPQswap
{
	public static void main(String[] qwe)
	{
		System.out.println("Enter variable a");
		int a = new Scanner(System.in).nextInt();
		System.out.println("Enter variable b");
		int b = new Scanner(System.in).nextInt();
		System.out.println("Variables before swapping, a: "+a+", b: "+b);
		a = a+b;
		b = a-b;
		a = a-b;		
		System.out.println("Swapped Variables, a: "+a+", b: "+b);
	}
}