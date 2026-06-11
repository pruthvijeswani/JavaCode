// Assignment 44: WAP to demonstrate multilevel-level inheritance.
package java_assignments;

public class AS44_Class1 extends AS44_Class2	//SubClass extends Super Class
{
	void logout()
	{
		System.out.println("Logout from the application ....");
	}
	
	public static void main(String[] args) 
	{
		AS44_Class1 a1 = new AS44_Class1();
		a1.luunchBrowser();
		a1.login();
		a1.logout();
		a1.closeBrowser();
	}

}
