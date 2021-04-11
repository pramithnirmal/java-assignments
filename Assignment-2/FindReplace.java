package Ass2;

public class FindReplace{

   public static void main(String args[]){
	   System.out.println(findAndReplace("got it with hash","hash","ppp"));
   }
   static String findAndReplace(String source, String old, String newword) {
		
		for(int i = 1 ; i<source.length();i++) {
			for(int j=0;j<i+1;j++) {
				if(source.substring(j,i).equals(old)) {
					String firstPart = source.substring(0, j);
					String lastPart  = source.substring(i,source.length());
					return firstPart+newword+lastPart;
				}
			}
		}
		return source;
		
	}
	
   
  
}