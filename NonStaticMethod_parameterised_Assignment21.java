/* Assignment 21: WAP to call 2 non static methods inside the main method by creating a single object
 * Parameterised Non-static method calling 
 */

package java_assignments;

public class NonStaticMethod_parameterised_Assignment21
{	
	static void mul(char z, double d, int i)
	{
		System.out.println(z +" "+d+" "+i);
	}
	static void intro(String a, double i, String b ) 
	{
		System.out.println(a+" "+ i+" "+ b);
		
	}
	void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	void sub(int a, int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		mul('A', 99.99, 7);
		intro("I'm having", 3.5, "years of exp. as a Functional QA.");
		
		NonStaticMethod_parameterised_Assignment21 a1=new NonStaticMethod_parameterised_Assignment21();
		a1.add(99, 19);
		a1.sub(99, 100);
	}

}
