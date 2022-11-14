package FileHandling;
import java.io.*;
public class ReadData {
	public static void main(String[] args) {
		
		try {
			FileReader f = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\TEXT.txt");
			try {
				int i;
				while ((i = f.read()) != -1) {
					System.out.print((char) i);
				}
			} 
			finally {
				f.close();
			}
		}
		catch (IOException i) {
			System.out.println(i);
		}
	}
}