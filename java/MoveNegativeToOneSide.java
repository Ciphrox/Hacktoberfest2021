package array;

import java.util.Scanner;

public class MoveNegativeToOneSide {

	public static void main(String[] args) {
		// 5 : Move all the negative elements to one side of the array
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("\nEnter the elements of array :: ");
		for (int i=0 ; i<n ; i++) {
			System.out.print("Enter the " + (i+1) + "th element : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\n Array before performig operations is : [  ");
		for (int ele : arr) System.out.print(ele + "  ");
		System.out.print("]\n");
		
		int temp,count=0;
		for (int i=0; i<n; i++) {
			if (arr[i] < 0)  {
				if (i!=count) {
					temp = arr[i];
					arr[i] = arr[count];
					arr[count] = temp;
				}
				count++;
			}
		}
		
		System.out.print("\n Array after performig operations is : [  ");
		for (int ele : arr) System.out.print(ele + "  ");
		System.out.print("]\n");
		
		sc.close();
	}

}
