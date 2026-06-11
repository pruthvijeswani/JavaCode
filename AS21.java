//Assignment 21: WAP to call 2 non static methods inside the main method by creating a single object
package java_assignments;

public class AS21 
{
		void login()
		{
			System.out.println("Login");
		}
		static void search()
		{
			System.out.println("Searching");
		}
		void logout()
		{
			System.out.println("Logout");
		}
		public static void main(String[] args) 
		{
			search();
			AS21 a = new AS21();
			a.login();
			a.logout();

		}

}
