//Assignment 3 & 13: Call Static Methods inside the main method

package java_assignments;
import module1.programs.*;
public class StaticMethodCalling_Assignment3_13
{
	public static void Login()
	{
		System.out.println("Enter your Usename: ");
		System.out.println("Enter your Password: ");
		System.out.println("Click on the Login button");
	}

	public static void main(String[] args)
	{
		System.out.println("Output of the program: ");
		Login();
		System.out.println("");
		
		System.out.println("Method Calling from another class but within the same package: ");
		ArithmaticOperators_Assignment4.mul();
		ArithmaticOperators_Assignment4.add();
		System.out.println("");
		
		System.out.println("Method calling from different package:");
		ArithmaticOperators.sub();
	}

}