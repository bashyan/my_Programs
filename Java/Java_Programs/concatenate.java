public class concatenate
{
	public static void main(String[] args)
	{
		String a = "GITABASHYAN";
		String b = "RAMAMOORTHY";
		char c[] = new char[a.length()+b.length()];		
		for (int i=0;i<a.length();i++)
		{
			c[i]= a.charAt(i);			
		}				
		for(int i=a.length(), j=0;i<a.length()+b.length();i++, j++)
		{			
			c[i]= b.charAt(j); 			
		}
		System.out.println(c);
	}
}