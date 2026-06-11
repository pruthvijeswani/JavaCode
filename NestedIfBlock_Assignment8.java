//Assignmen8: Write a Program on nested if Else Block_Case

package java_assignments;

public class NestedIfBlock_Assignment8
{
    public static void main(String[] args)
    {
        int marks = 65;

        if (marks >= 90)
        {
            System.out.println("Grade A");
        }
        else
        {
            if (marks >= 75)
            {
                System.out.println("Grade B");
            }

            if (marks >= 60)
            {
                System.out.println("Grade C");
            }

            if (marks < 60)
            {
                System.out.println("Fail");
            }
        }
    }
}
