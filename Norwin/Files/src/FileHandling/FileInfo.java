package FileHandling;
import java.io.File;
public class FileInfo {
	
	public static void main(String args[]) {
		try {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\TEXT.txt");
		if(f.exists()) {
			System.out.println("file name:"+f.getName());
			System.out.println("file location:"+f.getAbsolutePath());
			System.out.println("file readable:"+f.canRead());
			System.out.println("file writeable:"+f.canRead());
			
		}
	}
		catch(Exception e) {
			System.out.println(e);
		}
			
		
	}
	}




