package FileHandling;
import java.io.File;
import java.io.IOException;
public class CreateFile {
	public static void main(String args[]) throws IOException {
		try {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\TEXT.txt");
		
			if(f.createNewFile()) {
				System.out.println("New file created");
			}
			else {
				System.out.println("file already exists");
			}
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		}	
}

