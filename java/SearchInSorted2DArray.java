import java.util.*;

public class SearchInSorted2DArray {
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 7;
        int[]result = find2D(arr, target);
        System.out.println(Arrays.toString(result));
    }

    // serach in the row provided between the columns provided .
    public static int[] binSearch(int[][]arr,int target,int row, int colStart , int colEnd){
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd-colStart)/2;
            if (arr[row][mid] == target) {

                return new int[]{row,mid};

            } else if(arr[row][mid]>target) {

                colEnd = mid-1;
                
            } else{

                colStart = mid+1;

            }

        }
        return new int[]{-1,-1};
    }

    public static int[] find2D(int[][]arr , int target){

        int row = arr.length;
        int col = arr[0].length;  // matrix may be empty .

        if (row == 1) {
            return binSearch(arr, target, 0, 0, col-1);
        }

        int rowStart = 0;
        int rowEnd = row-1;
        int colMid = (col-1)/2;


        // run the loop untill only 2 rows remain .
        // while this condition is true rows will remain > 2 . 
        while (rowStart < (rowEnd-1)) {
            int mid = rowStart + (rowEnd-rowStart)/2;
            if (arr[mid][colMid] == target) {

                return new int[]{mid,colMid};

            } else if(arr[mid][colMid] > target) {
                rowEnd = mid;
            } else{
                rowStart = mid;
            }   
        }

        // now we have two rows at the end of above while loop .
        // check whether the target is in  the column of these 2 rows .
        if (arr[rowStart][colMid] == target) {
            return new int[]{rowStart,colMid};
        }
        if (arr[rowStart+1][colMid] == target) {
            return new int[]{rowStart+1,colMid};
        }

        // otherwise search in 1st , 2nd , 3rd and 4th half of the matrix / arr .
        // search in 1st half 
        if (arr[rowStart][colMid-1]>=target) {
            return binSearch(arr, target, rowStart, 0, colMid-1);
        }
        // search in 2nd half 
        if (arr[rowStart][colMid+1]<=target && arr[rowStart][col-1]>=target ) {
            return binSearch(arr, target, rowStart, colMid+1, col-1);
            
        }
        
        // search in 3rd half 
        if (arr[rowStart+1][colMid-1]>=target) {
            return binSearch(arr, target, rowStart+1, 0, colMid-1);
            
        }
        // search in 4th half 
        if (arr[rowStart+1][colMid+1]<=target ) {
            return binSearch(arr, target, rowStart+1, colMid+1, col-1);
            
        }


        return new int[]{-1,-1};
    }

}
