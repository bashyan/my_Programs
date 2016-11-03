/*find factorial, find amstrong or not?*/

import java.util.*;

class amstrong
{
private static void main(String[] args)
	{
	int b,c,d=0;
	int x=10;
	int y=12;
	Scanner ams=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=ams.nextInt();
	int e=a;
	for(int i=1;i<=3;i++)
		{
		b=a/10; c=a%10;
		a=b;
		d=d+(c*c*c);		
		}
	System.out.println(d);
	if(d==e)
		{
		System.out.println("It is Amstrong number");
		}
	else
		{
		System.out.println("It's not Amstrong number");
		}
	}
}

class factorial
{
public static void main(String[] args)
	{
	Scanner fac=new Scanner(System.in);
	System.out.println("Enter the number");
	int ab=fac.nextInt();
	int ba=ab;
	while(ba>1)
		{
		ab=ab*(--ba);
		}
	System.out.println("Factorial is  "+ab); 
	
	}
}
	

	
