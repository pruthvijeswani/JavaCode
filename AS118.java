//Assignment 118: WAP to demonstrate Collections methods
package java_assignments;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class AS118 
{
	public static void main(String [] args)
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(99);
		a1.add(94);
		a1.add(94);
		a1.add(15);
		a1.add(100);
		a1.add(94);
		System.out.println(a1);
		
		int c1=Collections.max(a1);
		System.out.println("Max-> "+c1);
		int c2=Collections.min(a1);
		System.out.println("Min-> "+c2);
		Collections.sort(a1);
		System.out.println("Sort-> "+a1);
		Collections.reverse(a1);
		System.out.println("Reverse-> "+a1);
		System.out.println("BinarySearch-> "+Collections.binarySearch(a1, 94));
		System.out.println("Frequency-> " +Collections.frequency(a1, 94));
		
	}
		
}
