//Assignment 30: WAP to Demonstrate Constructor Overloading in Java
package java_assignments;

public class AS30 
{
	AS30(int a)
	{
		System.out.println("This is the 1st Constructor:"+a);
	}
	AS30(int a, int b)
	{
		int sum=a+b;
		System.out.println("This is the 2nd Constructor:"+sum);
	}
	public static void main(String[] args) 
	{
		AS30 a1 = new AS30(30);
		AS30 a2 = new AS30(25, 25);
		

	}

}
