
package recursion;


public class PrintNQueens {

    
public static void printnqueens(boolean board[][],int row,String ans){
        
        if(row==board.length){
            System.out.println(ans);
            return;
        }
        
        for(int col=0;col<board[row].length;col++){
            
            if(isItsafe(board,row,col)){
                board[row][col]=true;
                printnqueens(board,row+1,ans + "{"+ (row+1)+"->"+(col+1)+"}");
                board[row][col]=false;
            }
        }
        
        
    }

    private static boolean isItsafe(boolean board[][],int row,int col){
        
        
        int rows=row-1;
        int cols=col;
        while(rows>=0){
            
            if(board[rows][cols]){
                return false;
            }
            
            rows--;
        }
        
        rows=row-1;
        cols=col-1;
        while(rows>=0 && cols>=0){
            
            if(board[rows][cols]){
                return false;
            }
            
            rows--;
            cols--;
        }
        
        rows=row-1;
        cols=col+1;
          while(rows>=0 && cols<board[0].length){
            
            if(board[rows][cols]){
                return false;
            }
            
            rows--;
            cols++;
        }
          
          rows=row;
          cols=col-1;
           while(cols>=0){
            
            if(board[rows][cols]){
                return false;
            }
            
            
            cols--;
        }
           
          
        return true;
    }
   
    public static void main(String[] args) {
        
        boolean board[][]=new boolean[4][4];
        printnqueens(board,0,"");
    }
    
}

   
    

