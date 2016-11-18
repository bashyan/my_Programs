import java.util.Scanner;
public class JPQcharOccurrence
{
	public static void main(String[] qwe)
	{
		System.out.println("Enter the String");
		String str = new Scanner(System.in).nextLine();
		System.out.println("Enter the character for counting the occurrence");
		char occur = new Scanner(System.in).next().trim().charAt(0);
		int count=0, countAll=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==occur)
			{
				count++;
			}
		}
		System.out.println("The given Character "+occur+" occurred "+count+" times");
		for(char i = 'a'; i<= 'z';i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==i)
				{
					countAll++;
				}
			}
			if(countAll!=0)
			{
				System.out.println("Character "+i+" occurred "+countAll+" times");
				countAll = 0;
			}
		}
		
	}
}