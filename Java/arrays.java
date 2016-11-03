import java.util.*;
class arrays
{
public static void main(String[] args)
{
	String nu[]={"1","2","3","4","5"};
	for(int n=0;n<2;n++)
		{
		System.out.print(nu[n]);
		}
	System.out.print("\n");
	for(String A: nu)
		{
		System.out.println("\t"+A);
		}


		System.out.println("Enter String 1");
	Scanner nam=new Scanner(System.in); String name=nam.nextLine();	
		
		System.out.println("Enter String 2");
	Scanner nam1=new Scanner(System.in);	String name1=nam1.nextLine();
		
	
	char[] namex=name.toCharArray();	
	char[] name1x=name1.toCharArray();  

	
	
	int a=0;
	for(int n=0;n<3;n++)
		{
			if(namex[n]==name1x[n])
			{
			a++;
			}
			else
			{
			a--;
			}
		}
	if(a==3)
		{ System.out.println("\nYes, It's Palindrome"); }
	else    { System.out.println("\nNot a Palindrome"); }	
	  
}
}