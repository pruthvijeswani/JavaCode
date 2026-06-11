//Assignment 27: WAP Using Math Class to Display PI, Random and addExact Values
package java_assignments;

public class AS27 
{
	public static void main(String[] args) 
	{
		double r=        Math.random();
        double        area=        Math.PI*r*r;
        System.out.println(area);
        
        int sum=        Math.addExact(101, 299);
        System.out.println(sum);
	}

}
