package FileHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException {
			 char[] data=new char[100];
			 
			 try {
				try (FileReader input = new FileReader("Data1.txt")) {
					input.read(data);
				}
				System.out.println("Data is Read Successfully.");
				System.out.println(data);
			 } 
			 catch (FileNotFoundException e) {
				
				System.out.println("Error in the Read File.");
			}

		}
	
}
