package FileHandling;

import java.io.*;

public class FileRename {
	public static void main(String args[]) {
		try {
			File f = new File("C:\\Users\\Admin\\eclipse-workspace\\TEXT.txt\\");
			File f2 = new File("C:\\Users\\Admin\\eclipse-workspace\\text.txt\\");

			if (f.exists()) {
				System.out.println(f.renameTo(f2));
			} else {
				System.out.println("file doesnot exist");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
