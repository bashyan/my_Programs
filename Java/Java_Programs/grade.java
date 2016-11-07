import java.util.*;
public class grade
	{
		int tot_mark=0, p;
		boolean fail=false;
		String grade;
		String[] sub_name = new String[5];
		int[] sub_mark = new int[5];
		String stu_name1, stu_name;
		Scanner student = new Scanner(System.in);
		public void scan()
			{
				System.out.println("Enter the name");
				String stu_name1 = student.next();
				stu_name = stu_name1;				
				for(int i=0,s=1;i<5;i++,s++)
					{						
						System.out.println("\nEnter the subject  " +s);
						sub_name[i] = student.next();
						System.out.println("\nEnter the mark for  " +sub_name[i]);
						sub_mark[i] = student.nextInt();
						if(sub_mark[i]<50)
							fail = true;
					}
			}
		public void display()
			{
				System.out.println("\nName:  "+stu_name);
				for(int i=0;i<5;i++)
					{
						System.out.println("\n"+sub_name[i] +"  \nMark - "+ sub_mark[i]);
						tot_mark = tot_mark+sub_mark[i];
					}				
			}
		public void calculate()
			{
				p = tot_mark/5;  //Percentage
				System.out.println("\nPercentage is "+p+"%");
				if(p<50 && p>=0 || fail==true)
					grade = "Fail";
				else
					if(p<=100 && p>=85)
						grade = "A+";
					else
						if(p<=84 && p>=75)
							grade = "A";
						else
							if(p<=74 && p>=65)
								grade = "B";
							else
								if(p<=64 && p>=50)
									grade = "C";
								else
									grade = "Invalid, Give valid marks";
				System.out.println("\nGrade obtained by  "+stu_name+"  is  "+grade);
			}
		public static void main(String[] args)
			{				
				System.out.println("\tStudent mark report\n");
				grade g = new grade();
				g.scan();
				g.display();
				g.calculate();							
			}
	}