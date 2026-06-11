//Assignment 23: WAP that declares a global variable and updates its value inside a method. Display the value before and after the update.
package java_assignments;
public class AS23 
{
	static int a=10;
	double b=1.5;
	public static void main(String[] args) 
	{
		System.out.println("Old Value of Global Variable 'a':"+a);
		a=11;
		System.out.println("Updates Value of Global Variable 'a': "+a);
		AS23 a1 = new AS23();
		System.out.println("Value of Instance Variable 'b':"+a1.b);
	}

}
