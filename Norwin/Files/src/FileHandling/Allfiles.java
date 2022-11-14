package FileHandling;

import java.util.*;
import java.io.*;

class onlyFiles implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		
		return false;
	}
	
	
}

public class Allfiles {
//	public static void main(String args[]) {
//
//		File f = new File("C:\\Users\\Admin\\eclipse-workspace");
//		System.out.println("files:");
//		String[] folder = f.list();
//		for(int i = 0;i<folder.length;i++) {
//			System.out.println(folder[i]);
//		}
		public static void main(String[] args) {
			File directoryPath = new File("C:\\Users\\Admin\\eclipse-workspace");
			
			//List all files and directories
			System.out.println("All files");
			for (File file : directoryPath.listFiles()) {
				System.out.println(file.getName());
			}		
			//List text files only
			System.out.println("Text files------------");
			File[] files=directoryPath.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.endsWith(".txt");
				}
			});
			File[] file=directoryPath.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.endsWith(".");
				}
			});
			for (File file1 : files) {
				System.out.println(file1.getName());
			}
			
			System.out.println("pdf files");
			File[] filespdf=directoryPath.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.endsWith(".pdf");
				}
			});
			File[] filep=directoryPath.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.endsWith(".");
				}
			});
			for (File file2 : filespdf) {
				System.out.println(file2.getName());
		}
}
}