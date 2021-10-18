
package recursion;


public class PrintMazepath {
    
    public static void printmazepath(int cr,int cc,int er,int ec,String ans){
        
        if(cr==er && cc==ec){
            System.out.println(ans);
            return;
        }
        
        if(cr>er || cc>ec){
            return;
        }
        
        printmazepath(cr,cc+1,er,ec,ans +"H");
        
        printmazepath(cr+1,cc,er,ec,ans +"V");
        
        printmazepath(cr+1,cc+1,er,ec,ans +"D");
        
        
    }

    
    public static void main(String[] args) {
        printmazepath(0,0,2,2,"");
    }
    
}
