package FileHandling;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {

		File myfile=new File("Data1.txt");
       
			if(myfile.delete())
			{
				System.out.println("File is deleted: "+myfile.getName() +"File is deleted successfully");
			
			}
			else {
				System.out.println("File is not Created");
			}
	}
}
		
