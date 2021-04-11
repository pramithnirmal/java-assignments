package Ass2;

public class Check{

   public static void main(String args[]){
       System.out.println(check(
   }
   
   static int check(String sentence, String word) {
		String[] words = sentence.split("hi how are you hi", "hi");// identify words based on the spaces 
		int word_count = 0;
		for(int i=0;i<words.length;i++) {
			if(words[i].equals(word)) {
				word_count++;
			}
		}
		return word_count;
	}
}