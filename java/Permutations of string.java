
import java.util.*;
class HelloWorld {
    static void Permutation(String s,String perm){
        if(s.length()==0){
            System.out.println(perm);
            return;
        }
        
        for(int i=0;i<s.length();i++){
            char currChar=s.charAt(i);
            String newStr=s.substring(0,i)+s.substring(i+1);
            Permutation(newStr,perm+currChar);
        }
    }
    public static void main(String[] args) {
         String s;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the String :");
         s=sc.nextLine();
         System.out.println("Permutations of string :");
         Permutation(s,"");
    }
}
