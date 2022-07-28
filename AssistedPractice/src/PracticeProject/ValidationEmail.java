package PracticeProject;
import java.util.regex.*;
import java.util.ArrayList;

public class ValidationEmail {
	public static void main(String[] args) {
			
        ArrayList<String> emails = new ArrayList<String>();  
	    
		emails.add("vishnusathi0@gmail.com");  
	    emails.add("rithika_0012gmail.com");  
	    emails.add("sakthi_2015@gmail.com");  
	    emails.add("radhavis0107yahoo.com");  
	    
	    String regex = "^[A-Za-z0-9+_.-]+@(.+)";  
	    
	    Pattern pattern = Pattern.compile(regex);  
	   
	    for(String email : emails)
	    {  
	        Matcher matcher = pattern.matcher(email);  
	        System.out.println(email +": "+ matcher.matches()+"\n");  
	    }
	}
}

