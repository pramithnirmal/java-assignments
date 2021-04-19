package ASS5;

import java.io.File;  
import java.util.Scanner;
public class CountWords{ 
	
	public static int countWords(String filePath) throws Exception{
		int wordCount   = 0;
		File file = new File(filePath);  
        Scanner b = new Scanner(file);  
              
        while(b.hasNextLine()) {  
            String words[] = b.nextLine().split(" ");  
            wordCount     += words.length;  
        }  
        b.close(); 
        return wordCount;

	}
    public static void main(String[] args)  {  
        
        try {
        System.out.println("Word Count = " + countWords("./x.txt")); 
        }catch(Exception ex) {
        	System.out.println(ex.getMessage());
        }
    }  
}  
