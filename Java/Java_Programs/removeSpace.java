public class removeSpace
{
	public static void main(String[] args)
	{
		String str = "                              This                          is                    java       ";
		String str2 = "";
		str2 = str.trim().replaceAll(" +", " ");
		System.out.println(str+"\n"+str2);		
	}
}