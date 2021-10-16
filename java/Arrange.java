import java.util.Scanner;

public class Arrange {
    public static void main(String[] args) {
        int i,j,k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the \"Number of Elements\" you want to Arrange");
        int n = sc.nextInt();
        int a[] = new int[n];
        int ar[] = new int[n];
        System.out.println("Enter the Elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(a[i]<0){
                ar[k] = a[i];
                k++;
            }
        }
        for(i=0;i<n;i++){
            if(a[i]>=0){
                ar[k] = a[i];
                k++;
            }
        }

        System.out.println("Elements Arranged are : Negative ---> Positive");
        for(i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
