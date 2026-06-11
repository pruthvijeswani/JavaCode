//Assignment 116: WAP to demonstrate Map interface methods replace(), size(), isEmpty() and clear()
package java_assignments;
import java.util.HashMap;
import java.util.Map;
public class AS116 
{

	public static void main(String[] args) 
	{
		 Map<String, Integer> m1 = new HashMap<String, Integer>();
		 m1.put("Hindi", 77);
		 m1.put("English", 99);
		 m1.put("Maths", 92);
		 m1.put("Science", 65);
		 m1.put("GK", 99);
		 m1.put("Gujarati", 54);
		 
		System.out.println(m1);
		
		System.out.println(m1.replace("English", 92));
		System.out.println(m1.replace("Maths", 92, 100));
		System.out.println("Size of-> "+m1.size());
		m1.clear();
		System.out.println("is m1 clear-> " +m1);
		System.out.println("Is m1 empty-> "+m1.isEmpty());
	}

}
