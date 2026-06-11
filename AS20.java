//Assignment 20:WAP to call non static method inside the main method
package java_assignments;

public class AS20 
{
	void add()
	{
		System.out.println("Addition");
	}
	static void sub()
	{
		System.out.println("Subtraction");
	}
	void mul()
	{
		System.out.println("Multiplication");
	}
	public static void main(String[] args) 
	{
		sub();
		AS20 v1 = new AS20();
		v1.add();
		v1.mul();

	}

}
