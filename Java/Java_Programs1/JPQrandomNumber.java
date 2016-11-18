import java.util.Random;
public class JPQrandomNumber
{
	public static void main(String[] qwe)
	{
		Random r = new Random();
		System.out.println("Random Numbers: ");
		for(int i=0;i<10;i++)
		{
			int ran = r.nextInt(99)+(1);
			System.out.print(ran+" ");
		}
	}
}