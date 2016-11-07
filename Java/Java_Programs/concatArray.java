public class concatArray
{
	public static void main(String[] args)
	{
		char a[] = {'i','\'','m',' ','a','n',' '};
		char b[] = {'e','n','g','i','n','e','e','r'};
		char c[] = new char[a.length+b.length];
		for (int i = 0; i<a.length; i++)
		{
			c[i] = a[i];
		}
		for(int i=a.length,j=0; i<a.length+b.length; i++,j++)
		{
			c[i] = b[j];
		}
		System.out.println(c);
	}
}