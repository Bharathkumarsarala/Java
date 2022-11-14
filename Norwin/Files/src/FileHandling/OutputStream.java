package FileHandling;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\streamfile.txt");
		
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("file created");
		}
		FileOutputStream fos = new FileOutputStream(file);
		String str = "streams";
		fos.write(str.getBytes());
		fos.close();
	}
}
