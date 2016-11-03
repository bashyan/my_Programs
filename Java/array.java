import java.util.*;
class array
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
	char[] name1x=name1.toCharArray();  int x;
	x=namex.length;
	System.out.println(x);
	
	int a=0;
	for(int n=0;n<x;n++)
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
	  


	/* STRING REVERSE */

	System.out.println("Enter the string to be reversed");
	Scanner revstr=new Scanner(System.in);
	String revstr1=revstr.next();
	char[] revstr2=revstr1.toCharArray(); 
	int p,t;
	p=revstr2.length;
	
	System.out.println("Array size is "+p);
	System.out.print("Reversed string is ");
	System.out.print("\n");
	for(int u=p-1;u>-1;u--)
		{
		System.out.print(revstr2[u]);
		}  

	

			

}
}