import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = readInteger();
        int[] array = readElements(count);
        int minNumber = findMin(array);

        System.out.println(minNumber);
    }

    private static int readInteger(){
        System.out.println("Enter the number of elements to be inserted in the array: ");
        return scanner.nextInt();
    }

    private static int[] readElements(int count){

        int[] inputArray = new int[count];

        for (int i=0; i< inputArray.length; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }

    private static int findMin(int[] array){

        Arrays.sort(array);
        return array[0];
//        int minValue = array[0];
//        for (int value : array) {
//
//
//            if (value < minValue) {
//                minValue = value;
//            }
//        }
//        return minValue;
    }
}