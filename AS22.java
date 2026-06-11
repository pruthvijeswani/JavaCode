//Assignment 22: WAP on non static global variable or instance variable
package java_assignments;

public class AS22 
{
	static String name = "Ana";		//global variable
	int a = 10;		//nonstatic or instance variable
	public static void main(String[] args) 
	{
		System.out.println(name);
		AS22 v1 = new AS22();		//calling instance variable
		System.out.println(v1.a);
	}

}
