import java.util.Scanner;
public class vowels
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner st = new Scanner(System.in);
		String str = st.nextLine();
		char[] ch = str.toCharArray();
		int x=0,y=0;		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == 'a' || ch[i] =='e' || ch[i] =='i' || ch[i] =='o' || ch[i] =='u' || ch[i] == 'A' || ch[i] =='E' || ch[i] =='I' || ch[i] =='O' || ch[i] =='U')
			{
				x++;			
			}
		}		
		System.out.println("Number of vowels in the string is "+x+" by using if statement");
		for(char A: ch)
		{
			switch(A)
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				y++;
				break;
				default:
			}
		}
		System.out.println("Number of vowels in the string is "+y+" by using switch case");
	}
}