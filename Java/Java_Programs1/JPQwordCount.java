import java.util.Scanner;
public class JPQwordCount
{
	public static void main(String[] qwe)
	{
		System.out.println("Enter the sentence");
		String str = new Scanner(System.in).nextLine();		
		String[] str1 = str.split(" ");
		int count = 1;
		for(String A: str1)
		{			
			System.out.println(count+". "+A);
			count++;
		}
		System.out.println("Word count is "+(count-1));
	}
}