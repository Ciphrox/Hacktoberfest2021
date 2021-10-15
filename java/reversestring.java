import java.util.Scanner;

public class reversestring{
    public static void main(String args[]) {
     
        //quick wasy to reverse String in Java - Use StringBuffer
        String word = "HelloWorld";
        String reverse = new StringBuffer(word).reverse().toString();
        System.out.printf(" original String : %s ,reversed String %s  %n", word, reverse);
     
        //another quick to reverse String in Java - use StringBuilder
        word = "WakeUp";
        reverse = new StringBuilder(word).reverse().toString();
        System.out.printf(" original String : %s ,reversed String %s %n", word, reverse);
     
        // one way to reverse String without using
        // StringBuffer or StringBuilder is writing
        // own utility method
        word = "Band";
        reverse = reverse(word);
        System.out.printf(" original String : %s ,reversed String %s %n",
                               word, reverse);
    }  
 
 
    public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }      
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
     
        return reverse;
    }
    
}
