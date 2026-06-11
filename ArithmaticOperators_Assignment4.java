//Assignment 4: "Write a program on +,-,*,/ and % operators"

package java_assignments;
public class ArithmaticOperators_Assignment4
{	
	public static void add()
	{	
		int a=100;
		int b=200;
		int 	add=a+b;
		System.out.println("Addition is:" + add);
	}
	
	public static void sub()
	{	
		int a=550;
		int b=200;
		int 	sub=a-b;
		System.out.println("Subtraction is:" + sub);
	}
	
	public static void mul()
	{	
		int a=100;
		int b=20;
		int 	mul=a*b;
		System.out.println("Multiplication is:" + mul);
	}
	
	public static void div()
	{	
		int a=1000;
		int b=200;
		int 	div=a/b;
		System.out.println("Division is:" + div);
	}
	public static void mod()
	{	
		int a=999;
		int b=10;
		int 	mod=a%b;
		System.out.println("Modulo is:" + mod);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Output of the program: ");
		add();
		sub();
		mul();
		div();
		mod();
	}
}