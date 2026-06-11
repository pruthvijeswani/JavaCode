//Assignment117: WAP to Demonstration of Map Iteration Techniques 
package java_assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AS117 
{
	        public static void main(String[] args) 
	        {
	                Map<Integer,String> m1=new HashMap<Integer,String>();
	                m1.put(010, "Ram");
	                m1.put(942, "Shayam");
	                m1.put(853, "Radha");
	                m1.put(797, "Rehman");
	                m1.put(745, "Vhihaan");
	                System.out.println(m1);
	                
	                System.out.println("Iterating all keys using KeySet:");
	                for( Integer i1:m1.keySet())
	                {
	                        System.out.println(i1);
	                }
	                
	                System.out.println("Iterating all values using Values:");
	                for(String s1:m1.values())
	                {
	                        System.out.println(s1);
	                }
	                
	                System.out.println("Iterating all Key:Value Pair using EntrySet:");
	                for(Entry<Integer, String> a1 :m1.entrySet())
	                {
	                		System.out.println(a1.getKey() +" -> "+a1.getValue());
	                }
	        }
	
}
