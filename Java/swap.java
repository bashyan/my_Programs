import java.util.Scanner;
public class swap
{
	public static void main(String[] args)
	{
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = ab.nextInt();
		System.out.println("Enter second number");
		int b = ab.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
	System.out.println("Swapped number 1: "+a+" \nSwapped number 2: "+b);
	}
}