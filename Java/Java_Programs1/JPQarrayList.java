import java.util.*;
public class JPQarrayList
{
	public static void main(String qwe[])
	{
		ArrayList ab = new ArrayList();
		ab.add("Start");
		ab.add(1, 8.04);
		ab.add('S');
		System.out.println("Size of Array List "+ab.size());
		System.out.println(ab);
		ab.add(1, 'C');
		System.out.println("Array List after add "+ab+" Size "+ab.size());
		System.out.println("Index 1 element is "+ab.get(1));
		ab.remove(2);
		System.out.println("Array List after remove "+ab+" Size "+ab.size());
	}
}