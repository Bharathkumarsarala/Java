package FileHandling;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class FilesEnd {
	    public static void main(String[] args)throws IOException {
	        List<String> textsFiles=new ArrayList<String>();
	        List<String> pdfFiles=new ArrayList<String>();
	        
	        File f1 = new File("D:\\Software's Dump\\intern"); 
	        File[] listFiles = f1.listFiles();
	        for(File f: listFiles) {     
	          String name = f.getName();
	          int lastIndexOf = name.lastIndexOf(".");
	          String extension = name.substring(lastIndexOf);
	          if(extension.equals(".txt")) {
	              textsFiles.add(name); 
	          }
	          else {
	            pdfFiles.add(name);  
	          }             
	        }
	        System.out.println("text files "+textsFiles.toString());	       
	        System.out.println("pdf files "+pdfFiles.toString());
	    }
	}