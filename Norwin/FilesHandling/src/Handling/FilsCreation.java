package Handling;

import java.io.File;
import java.io.IOException;

public class FilsCreation {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\TEXT.txt");
		try {
			if (f.createNewFile()) {
				System.out.println("New file created");
			} else {
				System.out.println("file already exists");
			}
		} catch (IOException i) {
			System.out.println("exception handled");
		}
	}
}
