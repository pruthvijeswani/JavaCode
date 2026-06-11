/*Assignment 15
WAP on nested if else block with if block and else block in which there are 3 if blocs present under else block			*/
			
package java_assignments;

public class NestedIfElse_Homework_Assignment15
{
    public static void main(String[] args) 
   {

        int a = 10;

        if (a > 20)   // false
        {
            System.out.println("IF block executed");
        }
        else
        {
            if (a > 5)
            {
                System.out.println("1");
            }

            if (a > 8)
            {
                System.out.println("2");
            }

            if (a > 15)
            {
                System.out.println("3");
            }
        }
    }
}