package PracticeProject3;
import java.util.*;

public class TreeMap3 {
	public static void main(String[] args) {
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();  
	      
	      map.put(7,"Violet");    
	      map.put(8,"Pink");    
	      map.put(9,"Brown");       
	      
	      System.out.println("The elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  

}
