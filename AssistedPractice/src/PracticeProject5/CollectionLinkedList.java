package PracticeProject5;
import java.util.LinkedList;
import java.util.Iterator;

public class CollectionLinkedList {
	public static void main(String[] args) {
		
	 LinkedList<String> names=new LinkedList<String>();  
	  names.add("Sheela");  
	  names.add("Bindu");  
	  names.add("Ravi");  
	  names.add("Ram");  
	  
	  Iterator<String> itr=names.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }
}
}


