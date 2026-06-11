package java_assignments;

public class StaticMethodCall_Assignment11
{
    public static void main(String[] args)
    {
        loginProcess();   // method call from main
    }

    // Static method 1
    public static void loginProcess()
    {
        System.out.println("Login process started");
        checkServerStatus();   // static method called inside another static method
    }

    // Static method 2
    public static void checkServerStatus()
    {
        System.out.println("Server is up and running");
    }
}
