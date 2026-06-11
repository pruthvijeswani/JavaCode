//Assignment 24: WAP that declares an global variable and a local variable with the same name. Display the value of local and global variable
package java_assignments;

public class AS24 
{
	public static int a=100;
    
    public static void main(String[] args) 
    {
            int a=452;
            System.out.println("Local variable value is: "+a);
            System.out.println("Global variable value is :"+AS24.a);           
    }

}
