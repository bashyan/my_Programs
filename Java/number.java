package packageBashyan;
import java.util.*;
class number
{ 
/*int a,b,c;
	public void number1()
		{
			a= 123654;
		System.out.println("Reversed number is  ");
		for(int i=0;i<6;i++)
			{
				b= a/10;
				c= a%10;
				a= b;
				System.out.print(c);	
			}
			System.out.println("");
		}

	public void oddeven()
		{
		int o=0,e=0;
		for (int i=1;i<11;i++)
			{
			Scanner n= new Scanner(System.in);
			System.out.println("Enter the number  "+i);
			int num=n.nextInt();
			System.out.println("Number "+i+ "  is  "+num);
			if(num%2==0)
				{
				e++;
				}
			else
				{
				o++;
				}
			}
		System.out.println("Number of even is  "+e+   "\nNumber of odd is  "+o);
		} 
	public void greater()
		{
		int g=0;
		System.out.println("Enter the numbers");
		for (int i=0;i<3;i++)
			{
			Scanner n= new Scanner(System.in);
			int num=n.nextInt();
			if(num>g) 
				{ 
				g= num; 
				} 
			}
		System.out.println("The greatest number is  "+g);
		} */

	public void ascii()
		{
		Scanner cha=new Scanner(System.in);
		System.out.println("Enter the Character");
		String chars=cha.next();
		char charac=chars.charAt(0);
		int ch=(int) charac;
		System.out.println("Entered character is:");
		if (ch>=33&&ch<=47||ch>=58&ch<=64||ch>=91&&ch<=96||ch>=123&&ch<=126)
			{
			System.out.println("Special Character");
			}
		else if(ch>=48&&ch<=57)
			{
			System.out.println("Number");
			}
		else if(ch>=65&&ch<=90)
			{
			System.out.println("UPPER CASE");
			}
		else if(ch>=97&&ch<=122)
			{
			System.out.println("lower case");
			}
		else 
			{
			System.out.println("Different Character");
			}
		}	

public static void main(String[] args)
	{
 	number rev = new number();
	 /*rev.number1();
	 rev.oddeven(); 
	 rev.greater();  */
	 rev.ascii();
 
	}
}


