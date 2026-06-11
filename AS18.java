//Assignment 18: WAP to demonstrate the use of a local variable and update it.

package java_assignments;

public class AS18 
{
	public static void main(String[] args) 
	{
		int length = 10;	//local variable
		int breadth = 20;	//local variable
		breadth = 21;	//update the value
		int area = length * breadth;	//area of rectangle
		System.out.println("Area of Rectangle is: " + area);

	}

}
