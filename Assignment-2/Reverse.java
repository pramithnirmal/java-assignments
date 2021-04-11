package Ass2;

public class Reverse{

   public static void main(String args[]){
		System.out.println(makeReverse("To be or not to be "));
   }
   
   static String  makeReverse(String str) {
		String[] words = str.split(" ");
		StringBuilder output = new StringBuilder();
		
		for(int word = 0; word<words.length;word++) {
			String rev_word = "";
			for(int letter = words[word].length(); letter>0;letter--) {
				rev_word += words[word].charAt(letter-1);
			}
			output.append(rev_word + " ");
		}
		return output.toString();
		
	}
  
}