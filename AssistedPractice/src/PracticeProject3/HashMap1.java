package PracticeProject3;
import java.util.*;
import java.util.Map;

public class HashMap1 {
	public static void main(String[] args) {
		
	HashMap<Integer,String> map=new HashMap<Integer,String>();    
	   map.put(1,"Red");
	   map.put(2,"Yellow");    
	   map.put(3,"White");   
	   map.put(4,"Black");   
	       
	   System.out.println("Iterating Hashmap");  
	   for(Map.Entry m : map.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   }  
	}  

}
