 
import java.util.*;

class NQueens {
    static String blank=".";
    static List<List<String>> ans=new ArrayList<List<String>>();
    
    
    
    public static void main(String[] args) {
    
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
        
    	for(int i=1;i<n;i++){blank+=".";}
       
    	List<String> grid=new ArrayList<>();
    	queensUtil(0,n,grid);
    	
    	for(List<String> l:ans) {
    		for(String s:l){System.out.println(s+" ");}
    		System.out.println(); 
    		}
    }
    
    public static void queensUtil(int i,int n,List<String> grid){
       if(i==n){ans.add(new ArrayList<String>(  grid));
        return  ;}
        StringBuilder s=new StringBuilder(blank);
        for(int j=0;j<n;j++){
             if(isPossible(i,j,n,grid)){ 
            
            s.setCharAt(j,'Q');
                grid.add(s.toString());
                queensUtil(i+1,n,grid) ;
                    grid.remove(grid.size()-1);
       
                    s.setCharAt(j,'.');
            
            } 
            
        } 
        return ;
    }
    public static boolean isPossible(int i,int j,int n,List<String> grid){
        // if(i<0||j<0||i>=n||j>=n)return false;
    	int b=1;
        for(int a=i-1;a>=0;a--){             
                if(j-b>=0) {if(grid.get(a).charAt(j-b)=='Q')return false;}
                if(j+b<n){if(grid.get(a).charAt(j+b)=='Q')return false;}
                if(grid.get(a).charAt(j)=='Q')return false;
                b++;                              
        }
        return true;
    } 
}
