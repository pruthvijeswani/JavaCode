//Assignment 26: WAP to Demonstrate Method Overloading Using Static and Non-Static Methods
package java_assignments;

public class AS26 
{
	 static void add(int a,int b)    
     {
             int c=a+b;
             System.out.println(c);
     }
     void add(char a)    
     {
             System.out.println("method 1");
     }
     static void add(String a)    
     {
             System.out.println("method 2");
     }
     static void add(String a,String b,int c,boolean d)   
     {
             System.out.println("method 3");
     }
     public static void main(String[] args) 
     {
             AS26 a1=new AS26();
             add(3,5);
             a1.add('X');
             add("Ram","House no 16",9,true);
             add("Ram");
     }

}
