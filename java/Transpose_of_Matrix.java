class Matrix
{
   public static void main(String args[])
   {
     int row, col,i,j,temp,n;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter the number of rows");
      row = in.nextInt();
     
      System.out.println("Enter the number  columns");
      col  = in.nextInt();
    if(row >col)
     n=row;
    else
     n= col;
      int mat1[][] = new int[n][n]; 
 
 
      System.out.println("Enter the elements of matrix");
   i= 0 ; 
while(i < row)
       {   
    
             j= 0 ; 
         while(j < col) 
             {
             mat1[i][j] = in.nextInt();
	j++; 
            }
           i++;
       }
      
      System.out.println("\n\nOriginal   matrix:-");
 i= 0 ; 
while(i < row)
       {   
    
             j= 0 ; 
         while(j < col) 
             {
                System.out.print(mat1[i][j]+" ");
	j++; 
            }
 
         System.out.println();
           i++;
       }
 	 i= 0 ; 
while(i < n)
       {   
    
             j= i+1 ; 
	
         while(j < n) 
             {
 temp=mat1[i][j]  ;
                   mat1[i][j] =mat1[j][i]  ;
		mat1[j][i]  =temp;	
j++; 
            }
 
           i++;
       }
 
 
      
 
 
      System.out.println("Transpose  of   matrix:-");
       i= 0 ;
while( i < col)
       {  
               j= 0 ; 
	while(j < row)
               {
                System.out.print(mat1[i][j]+" ");
             j++; 
 	}
         System.out.println(); 
 i++ ;
       }
   }
}
