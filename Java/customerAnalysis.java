import java.util.*;
public class customerAnalysis
	{
		int tot_rating=0, p;		
		String[] cus_name = new String[10];
		int[] cus_rating = new int[10];
		Scanner customer = new Scanner(System.in);
		public void scan()
			{
								
				for(int i=0,s=1;i<10;i++,s++)
					{						
						System.out.println("\nEnter the customer name  " +s);
						cus_name[i] = customer.next();
						System.out.println("\nEnter the rating from 1 to 5, Ms./Mr.  " +cus_name[i]);
						cus_rating[i] = customer.nextInt();
						if(cus_rating[i]>5)
							cus_rating[i] = 5;
						if(cus_rating[i]<1)
							cus_rating[i] = 1;
					}
			}
		public void display()
			{
				for(int i=0;i<10;i++)
					{
						System.out.println("\nCustomer Ms./Mr. "+cus_name[i] +"  gives rating "+ cus_rating[i]);
						tot_rating = tot_rating+cus_rating[i];
					}				
			}
		public void calculate()
			{
				p = tot_rating/10;  //Percentage
				System.out.println("\nTotal Customer :10");
				System.out.println("\nRating obtained by Andriod One Mobile is  "+p);
			}
		public static void main(String[] args)
			{				
				System.out.println("\tAndriod One Mobile\n");
				customerAnalysis g = new customerAnalysis();
				g.scan();
				g.display();
				g.calculate();							
			}
	}