public class JPQprimeNumber
{
	public static void main(String[] qwe)
	{		
		int mod, count=0, i=2, y=0,p;
		System.out.println("First 1000 Prime Numbers");
		while(count<1000)
		{			
			p=0;			
			for(int j=2;j<i;j++)
			{
				mod = i%j;				
				if(mod==0)
				{
					p++;
				}							
			}
			if(p==0)
			{
				System.out.println(i);
				count++;
				y = y + i;
			}
			i++;
		}
		System.out.println("Sum of first 1000 prime numbers "+y);
	}
}