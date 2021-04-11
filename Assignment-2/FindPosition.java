package Ass2;

public class FindPosition{

   public static void main(String args[]){
       int[] nos = {1,2,3,4,5};
	   System.out.println(findPosition(4,nos));
		
   }
   
   static int findPosition(int num,int[] nos) {
		for(int i=0;i<nos.length;i++) {
		    if(nos[i]==num) {
		    	return i;
		    }
		}
		return -1;  //num is not in the nos.
	}
   
   
  
}