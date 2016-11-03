class pyramid
{
public static void main(String[] arg)
{
int i,j;
for(i=0;i<6;i++)
	{
	for(j=0;j<i;j++)
		{
		System.out.print("*");
		}
	System.out.println("");
	}
	
	System.out.println("");

 for(i=0;i<6;i++)
	{
	for(j=6;j>i;j--)
		{
		System.out.print("*");
		}
	System.out.println("");
	}
	
for(i=0;i<6;i++)
	{
	for(j=1;j<i;j++)
		{
		System.out.print(j);
		}
	System.out.println("");
	}

int k=1;
for(i=0;i<5;i++)
	{
	for(j=1;j<i;j++)
		{
		System.out.print(k);
		k++;
	}
	System.out.println("");
	}

int a=0;
for(i=0;i<5;i++)
	{
	for(j=0;j<i;j++)
		{
		System.out.print(a);
		a++;
	}
	System.out.println("");
	}


}
}
