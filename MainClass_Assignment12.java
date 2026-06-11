// Assignment 12: WAP to call static method inside another static method outside the class but within the same package

package java_assignments;

public class MainClass_Assignment12 
{

    static void callStaticMethod() 
    {
        // Calling static method of another class within same package
        UtilityClass_Assignment12.displayMessage();
    }

    public static void main(String[] args) {
        callStaticMethod();
    }
}
