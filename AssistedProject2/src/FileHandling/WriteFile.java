package FileHandling;
import java.io.FileWriter;

public class WriteFile {
	
	public static void main(String args[]) {
			String data= "01,Vishnu Vardhini S,Tamilnadu,India";
		
		
		try {
		FileWriter output= new FileWriter("Data1.txt");
		output.write(data);
		System.out.println("File Written Successfully");
		output.close();
		}
		catch(Exception e)
		{
			System.out.println("Error File: "+ e);
		}
	}

}
