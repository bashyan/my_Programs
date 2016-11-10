						// The Character Stream Reader and Writer
import java.io.*;
import java.util.*;
public class fileStreamReader
{
	public static void main(String g[]) throws Exception
	{
		// Read .txt file
		
		FileReader filer = new FileReader("C:\\Users\\Bashyan PC\\Documents\\GitHub\\Java-Starter\\FileReader.txt");
		BufferedReader buffer = new BufferedReader(filer);
		String s;
		
		while((s = buffer.readLine())!=null)
		{
			System.out.println(s);
		}
		
		filer.close();
		
		// Write Customer details to .txt file
		
		FileWriter filew = new FileWriter("C:\\Users\\Bashyan PC\\Documents\\GitHub\\Java-Starter\\FileWriter.txt");
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter number of customer details to be stored");
		int count = ab.nextInt();
		String s1[][] = new String[count][3];	
		
		for(int i=0; i<count; i++)
		{
			System.out.println("Enter customer #"+(i+1)+" ID, Name, Age");		
			for(int j=0;j<3;j++)
			{
				s1[i][j] = ab.next();				
			}			
		}
		
		for(String[] A : s1)
		{ 
			for(String B : A)
			{
				filew.write(B);
			}
		}
		
		System.out.println("Customer_ID"+"\t"+"Name"+"\t\t"+"\tAge");
		
		for(int i=0; i<count; i++)
		{						
			for(int j=0;j<3;j++)
			{				
				System.out.print(s1[i][j]+"\t\t\t");
			}
			System.out.println("");
		}		
		System.out.println("File Written");
		filew.close();
	}
}