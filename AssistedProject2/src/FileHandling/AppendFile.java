package FileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
	public static void main(String[] args) {
			String data=" The data is appended";
			
			try {
				FileWriter output=new FileWriter("Data1.txt",true);
				output.write(data);
				System.out.println("File is Appended Successfully.");
				output.close();
			} 
			catch (IOException e) {
				System.out.println("File Append Failed");
			}

		}

}
