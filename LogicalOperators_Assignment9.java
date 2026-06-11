package java_assignments;

public class LogicalOperators_Assignment9 
{

    public static void main(String[] args) 
    {

        // Tech scenario: Login and access control
        boolean isUsernameValid = true;
        boolean isPasswordValid = false;

        boolean isAdmin = false;
        boolean isManager = true;

        // AND Operator
        if (isUsernameValid && isPasswordValid) 
        {
            System.out.println("Login successful (AND)");
        } 
        else 
        {
            System.out.println("Login failed (AND)");
        }

        // OR Operator
        if (isAdmin || isManager) 
        {
            System.out.println("Access granted (OR)");
        } 
        else 
        {
            System.out.println("Access denied (OR)");
        }

        // NAND Operator (NOT of AND)
        if (!(isUsernameValid && isPasswordValid)) {
            System.out.println("Login failed (NAND)");
        } 
        else 
        {
            System.out.println("Login passed (NAND)");
        }

        // NOR Operator (NOT of OR)
        if (!(isAdmin || isManager)) {
            System.out.println("No access privileges (NOR)");
        } 
        else 
        {
            System.out.println("User has access privileges (NOR)");
        }
    }
}
