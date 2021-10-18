
#include<stdio.h>
void displayArray(int arr[][3],int row,int col);
int main(){
    int row,col=3;
    printf("Enter no.of Rows in your matrx ");
    scanf("%d",&row);

    int array[row][col];
    for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){

                    printf("Enter a %d row %d column number ",i,j);
                    scanf("%d",&array[i][j]);

        }
    }

    displayArray(array,row,col);

}

void displayArray(int arr[][3],int row,int col){
    int i;
    printf("Before Rotation\n");
    for(i=0;i<row;i++){
        for(int j=0;j<col;j++){
            printf("%d",arr[i][j]);
        }
        printf("\n");
    }

    int new_arr[row];
        for(i=0;i<row;i++){
        new_arr[i]=arr[i][2];
    }
    //rotating

    for(i=0;i<row;i++){

        arr[i][col-1]=arr[i][col-2];
    }
    for(i=0;i<row;i++){

        arr[i][col-2]=arr[i][col-3];
    }
    for(i=0;i<row;i++){

        arr[i][col-3]=new_arr[i];
    }
    //display array
    printf("After Rotation\n");

    for(i=0;i<row;i++){
        for(int j=0;j<col;j++){
            printf("%d",arr[i][j]);
        }
        printf("\n");
    }
}

/* Example

Before Rotation
1 2 3
4 5 6
7 8 9 

After Rotation
3 1 2
6 4 5
9 7 8


*/