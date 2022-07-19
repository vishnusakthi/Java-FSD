package PracticeProject3;
import java.util.*;

public class HashTable2 {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(5,"Green");  
	      ht.put(6,"Blue");  
	      ht.put(7,"Orange");  
	       
	      System.out.println("The elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }

	}
	

}
