package PracticeProject;

import java.util.regex.*;
import java.util.ArrayList;

public class ValidationEmail {
	
	public static void main(String[] args) {
			

		ArrayList<String> emails = new ArrayList<String>();  
	    emails.add("vishnusathi0@gmail.com");  
	    emails.add("rithikaaa0012gmail.com");  
	    emails.add("sakthivel2015@gmail.com");  
	    emails.add("radhavis24289@yahoo.com");  
	    
	    String regex = "^(.+)@(.+)$";  
	    
	    Pattern pattern = Pattern.compile(regex);  
	   
	    for(String email : emails){  
	         
	        Matcher matcher = pattern.matcher(email);  
	        System.out.println(email +" : "+ matcher.matches()+"\n");  
	    }
	}
}

