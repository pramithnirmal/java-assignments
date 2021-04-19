package ASS5;

import java.io.File;
import java.util.*;


public class DisplayContent {
	
	static Map<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();


	static void getFileList(File[] files, int index, int level) {
		if(files==null) {System.out.println("No content");return;}
		if(index==files.length)
			return;
		
		for(int i=0; i<level; i++) {
			System.out.print("\t");
		}
		
		if(files[index].isFile()) {
			System.out.println(files[index].getName());
		}
		else if(files[index].isDirectory()) {
			System.out.println("<"+files[index].getName()+">");
			getFileList(files[index].listFiles(), 0, level+1);
		}
		
		
		getFileList(files, ++index, level);
	}
	
	public void displayFolderContents(String path) {
		File directory = new File(path);
		getFileList(directory.listFiles(), 0, 0);
	}
	
	public static void main(String[] args) {
		String dirString = "./";
		DisplayContent displayContent = new DisplayContent();
		displayContent.displayFolderContents(dirString);
	}


}
