package OOPS;

public class Polymorphism {
	
	    public int sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } 
	    public static void main(String args[]) 
	    { 
	        Polymorphism s = new Polymorphism(); 
	        System.out.println(s.sum(50, 100)); 
	        System.out.println(s.sum(10, 20, 30)); 
	        System.out.println(s.sum(10.5, 50.5)); 
	    } 
	}

