//Assignment 7: Write a Program on If else if Block

package java_assignments;

public class IfElseIfExample_Assignment7
{
	public static void main(String[] args)
	{	
		int salary = 1100;
		if(salary>1100)
		{
			System.out.println("Sufficient Balance");
		}
		else if(salary<1100)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			System.out.println("Please maintain the minimum balance in your account");
		}
	}

}