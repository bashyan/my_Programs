import java.util.*;
public class customerMonthlyAnalysis
	{
		int tot_price =0, p;		
		String[] prd_quan = new String[50];
		int[] prd_price = new int[50];
		Scanner customer = new Scanner(System.in);
		int x1,x;
		String cus_name1, cus_name;
		public void scan()
			{
				System.out.println("Enter no. of products");
				int x1 = customer.nextInt();
				x = x1;
				System.out.println("Enter the name");
				String cus_name1 = customer.next();
				cus_name = cus_name1;				
				for(int i=0,s=1;i<x;i++,s++)
					{						
						System.out.println("\nEnter the product name,quantity  " +s);
						prd_quan[i] = customer.next();
						System.out.println("\nEnter the product price for  " +prd_quan[i]);
					 	prd_price[i] = customer.nextInt();
						}
			}
		public void display()
			{
				for(int i=0;i<x;i++)
					{
						
						tot_price  = tot_price + prd_price[i];
						}
				System.out.println("Total price for "+x+" items is "+tot_price);
			}
		public void calculate()
			{
				p = tot_price /100;  //Percentage for Rs. 10,000 salary
				System.out.println("\nCustomer Ms./Mr. "+cus_name+" purchases "+x+" products. Monthly salary is Rs. 10,000. "+p+"% of salary is spent on purchases every month");
				}
		public static void main(String[] args)
			{				
				
				customerMonthlyAnalysis g = new customerMonthlyAnalysis();
				g.scan();
				g.display();
				g.calculate();
				
											
			}
	}