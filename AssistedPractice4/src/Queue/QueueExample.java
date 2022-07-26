package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) 
	{
	        		Queue<String> locationsQueue = new LinkedList();
	locationsQueue.add("Tamilnadu");
	        		locationsQueue.add("Chennai");
	        		locationsQueue.add("Coimbatore");
	        		locationsQueue.add("Tirupur");
	        		locationsQueue.add("Erode");
	        	    locationsQueue.add("Salem");
	        	    
	        	    System.out.println("The Queue is : " + locationsQueue);
	        		
	        	    System.out.println("The Head of Queue is: " + locationsQueue.peek());
	        		
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}
}
