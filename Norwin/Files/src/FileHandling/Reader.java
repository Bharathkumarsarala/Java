package FileHandling;

import java.io.*;
import java.lang.*;

public class Reader {
	public static void main(String args[]) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\TEXT.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
		System.out.println(str);
	}
}
