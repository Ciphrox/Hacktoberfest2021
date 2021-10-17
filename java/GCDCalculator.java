package algorithms.recursion;

import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input two integers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        scanner.close();
        var maximum = Math.max(firstNumber, secondNumber);
        var minimum = Integer.sum(firstNumber, secondNumber) - maximum;
        System.out.println("GCD(" + maximum + ", " + minimum + ") = " + calculateGCD(maximum, minimum));
    }

    private static int calculateGCD(int firstNumber, int secondNumber) {
        int remainder = firstNumber % secondNumber;
        if (remainder == 0) {
            return secondNumber;
        }
        return calculateGCD(secondNumber, remainder);
    }
}
