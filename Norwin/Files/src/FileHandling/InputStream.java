package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\streamfile.txt");
		
		FileInputStream fis = new FileInputStream(file);
		int i;
		while((i = fis.read()) != -1) {
			
			System.out.print((char)i);		
		}		
	}
}
