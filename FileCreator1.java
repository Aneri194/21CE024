//21CE024_Aneri
package Assignment5;
import java.io.IOException;
import java.nio.file.Files;  
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileCreator1{
	public static void main(String... args) {
           File file = new File("newFile.txt");
		try{
			System.out.println("Using createNewFile() method:");
			boolean isFileCreated = file.createNewFile();
			if(isFileCreated){
				System.out.println("File created at Path: " + file.getAbsolutePath());
			}
			else{
				System.out.println("File already exist at Path: " + file.getAbsolutePath());
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
         }
}
