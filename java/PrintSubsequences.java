
package recursion;


public class PrintSubsequences {

    public static void printsub(String ques,String res){
        
        if(ques.length()==0){
            System.out.println(res);
            return;
        }
        
        char ch=ques.charAt(0);
        
        String ros=ques.substring(1);
        
        printsub(ros,res);
        printsub(ros,res+ch);
    }
    
    public static void main(String[] args) {
        
        printsub("abc","");
        
    }
    
}
