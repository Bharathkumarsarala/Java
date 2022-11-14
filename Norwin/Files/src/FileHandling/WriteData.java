package FileHandling;

import java.io.*;

public class WriteData {
	public static void main(String args[]) {

		try {
			FileWriter f = new FileWriter("C:\\Users\\Admin\\eclipse-workspace\\TEXT.txt");
			try {
				f.write("Todays task:files");
			} finally {
				f.close();
			}
			System.out.println("data entered");
		} catch (IOException i) {
			System.out.println(i);
		}
	}
}
