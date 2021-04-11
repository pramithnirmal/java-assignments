package Ass2;

public class CheckKeyWord{

   public static void main(String args[]){
       System.out.println(isPresent("Redmi Note 5", "Redmi"));
   }
   
   static boolean isPresent(String productName, String keyword) {
		for(int i = 1 ; i<productName.length();i++) {
			for(int j=0;j<i;j++) {
				if(productName.substring(j,i).equals(keyword)) {
					return true;
				}
			}
		}
		return false;
	}
	
   
   
  
}