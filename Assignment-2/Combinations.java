package Ass2;
public class Combinations {
  
    static void getAll(String str,String ans)
    {    
  
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
  
        for (int i = 0; i < str.length(); i++) {
  
            char ch = str.charAt(i);
  
            String ros = str.substring(0, i) + 
                         str.substring(i + 1);
  
            getAll(ros,ans+ch);
        }
    }
   
    public static void main(String[] args)
    {
        
        getAll("abcd","");
    }
}