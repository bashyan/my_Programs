public class replaceChar
{
	public static void main(String[] args)
	{
		String str = "I'm an engineer";		
		System.out.println("String before: "+str+"\tString later: "+str.replace('n','o'));	
		System.out.println("String before: "+str+"\tString later: "+str.replace("engineer","analyst"));
	}
}