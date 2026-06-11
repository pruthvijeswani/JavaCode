/*WAP on switch case
a) try switch case problem with int
b) try switch case problem with String
c) try switch case problem with char */

package java_assignments;
public class SwitchCase_Assignment17
{
	public static void main(String[] args) 
	{
		int input;
		char grade;
		String city="Gandhinagar";
		
		switch(input=100)
		{
		case 1: 
				System.out.println("Integer 1 is preinted");
				break;
		case 2:
				System.out.println("Interger 2 is printed");
				break;
		default:		
				System.out.println("Invalid Integer");

		}
		switch('Z')
		{
		case 'A':
				System.out.println("Grade A");
				break;
		case 'B': 	
				System.out.println("Grade B");
				break;
		default:
				System.out.println("Invalid grade");
		}
		switch(city)
		{
		case "Gandhinagar":
			System.out.println("City printed");
			break;
		default:	
				System.out.println("Unknown city");
		}
		
		
	}	
	
}