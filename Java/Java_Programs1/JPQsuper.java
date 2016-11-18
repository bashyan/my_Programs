import java.util.Scanner;
class A
{
	String str = "This is Super class";	
}
class JPQsuper extends A
{
	void display()
	{
		String str = "This is Sub class";
		System.out.println("Enter option,\n1. with super\n2. without super");
		int option = new Scanner(System.in).nextInt();
		String value=null;
		if(option == 1)
		{
			value = super.str;  // invokes Super class variable
		}
		else if(option == 2)
		{
			value = str;
		}
		else
		{
			System.out.println("Enter valid option");
		}
		System.out.println(value);
	}
	public static void main(String[] qwe)
	{
		JPQsuper b = new JPQsuper();
		b.display();
	}
}