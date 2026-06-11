/*Assignment 16: Write a Program on nested if Else Block_Case.
WAP in which there is if else if block present and  
a) if block is present iwth 2 if blocks in it
b) else if block is present with another if else if block present in it
c) Last, else block is present with just if and else block in it
*/

package java_assignments;

public class NestedIfElse_Homework1_Assignment16
{
    public static void main(String[] args)
    {
        int a = 10;

        if (a > 5)          // c1 → true
        {
            if (a < 20)     // c2 → true
            {
                System.out.println("IF-1");
            }

            if (a == 10)    // c3 → true
            {
                System.out.println("IF-2");
            }
        }
        else if (a > 15)    // c4 → false
        {
            if (a == 20)    // c5
            {
                System.out.println("ELSE-IF → IF");
            }
            else if (a == 25)   // c6
            {
                System.out.println("ELSE-IF → ELSE IF");
            }
            else
            {
                System.out.println("ELSE-IF → ELSE");
            }
        }
        else
        {
            if (a < 0)      // c7
            {
                System.out.println("ELSE → IF");
            }
            else
            {
                System.out.println("ELSE → ELSE");
            }
        }
    }
}
