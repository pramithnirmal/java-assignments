package ASS5;

import java.io.File;
import java.util.List;
public class FileSearch {
	
	public static boolean searchFile(String path, String fileName) {
		File fileDir = new File(path);
		String[] list =  fileDir.list();
		
		for(String name : list) {
			if(name.equals(fileName)) {
				return true;
			}	
		}
		
		return false;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(searchFile("ABC","x.txt"));

	}

}
