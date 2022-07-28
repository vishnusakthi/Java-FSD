package FileHandling;
import java.io.File;
import java.io.IOException;

public class CreateFile {
        public static void main(String[] args) {
				
				File myfile=new File("Data1.txt");
		        try {
					if(myfile.createNewFile())
					{
						System.out.println("File is Successfully Created");
					}
					else {
						System.out.println("File is not Created");
					}
				} 
		        catch (IOException e) {
					
					System.out.println("File is not created successfully");
				}
			}
}
