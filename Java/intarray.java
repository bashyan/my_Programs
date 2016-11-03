import java.util.*;
class intarray
{
public static void main(String[] args)
{
	System.out.println("Enter the Integer to be reversed upto 9 digits");
	Scanner num=new Scanner(System.in);
	int a=num.nextInt(); int p= (int) Math.log10(a) + 1;
	int b,c,d,e,f,g,h;
	b= a/10; c= a%10;
	d= b/10; e= b%10;
	f= d/10; g= d%10; 
		 h= f%10;
	/* System.out.print(c); 
	System.out.print(e); 
	System.out.print(g); 
	System.out.println(h);  */

	for(int i=0;i<p;i++)
		{
		b= a/10; c= a%10;
		a= b;
		System.out.print(c); }
}
}