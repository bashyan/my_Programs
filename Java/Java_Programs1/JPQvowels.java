import java.util.Scanner;
public class JPQvowels
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner st = new Scanner(System.in);
		String str = st.nextLine();
		char[] ch = str.toCharArray();
		char cha;
		
		// Swap first and last vowel
		int r = 0, t = ch.length-1;
		if((ch[r] == 'a' || ch[r] =='e' || ch[r] =='i' || ch[r] =='o' || ch[r] =='u' || ch[r] == 'A' || 
			ch[r] =='E' || ch[r] =='I' || ch[r] =='O' || ch[r] =='U') && (ch[t] == 'a' || ch[t] =='e' || 
			ch[t] =='i' || ch[t] =='o' || ch[t] =='u' || ch[t] == 'A' || ch[t] =='E' || ch[t] =='I' || 
			ch[t] =='O' || ch[t] =='U'))
			{
				cha = ch[t];
				ch[t] = ch[r];
				ch[r] = cha;
			}
			
		// Swap vowels inside the string
		int x=0;
		for(int i=1;i<ch.length-2;i++)
		{
			for(int j=i+1;j<ch.length-2;j++)
			{
				x = 0;
				System.out.println("\ni "+i+" -"+ch[i]+"- j "+j+" -"+ch[j-1]+"- length "+ch.length);
				if((ch[i] == 'a' || ch[i] =='e' || ch[i] =='i' || ch[i] =='o' || ch[i] =='u' || ch[i] == 'A' || 
					ch[i] =='E' || ch[i] =='I' || ch[i] =='O' || ch[i] =='U') && (ch[j] == 'a' || ch[j] =='e' || 
					ch[j] =='i' || ch[j] =='o' || ch[j] =='u' || ch[j] == 'A' || ch[j] =='E' || ch[j] =='I' || 
					ch[j] =='O' || ch[j] =='U'))
					{
						x++;
					}
				System.out.println("x "+x);	
				if(x!=0)
				{
					cha = ch[j];
					ch[j] = ch[i];
					ch[i] = cha;
					System.out.println("\nch[i] "+ch[i]+"	ch[j] "+ch[j-1]);	
				}
			}
		}
		System.out.print("Reversed Vowels in string\n");
		for(char W: ch)
		{
			System.out.print(W);
		}
	}
}