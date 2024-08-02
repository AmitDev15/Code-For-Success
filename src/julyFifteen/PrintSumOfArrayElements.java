// 7.Write a program that calculates and prints the sum of all elements in an array.
// 8.Write a program that calculates and prints the average of elements in an array.
// 9.Write a program that finds and prints the maximum value in an array of integers.
package julyFifteen;

import java.util.Scanner;

public class PrintSumOfArrayElements {
    public static void main(String[] args) {
        int[] sumArr = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sumArr.length; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            sumArr[i] = sc.nextInt();
            sum += sumArr[i];
        }
        System.out.println("Your entered array is: ");
        for (int i = 0; i < sumArr.length; i++) {
            System.out.print(sumArr[i] + " ");
        }
        System.out.println();
        System.out.println("Sum of all array elements is: " + sum);

        //Average of elements in an array
        float arrAverage = (float) sum / sumArr.length;
        System.out.println("Average of array elements is: " + arrAverage);

        //Maximum value in an array
        int maxNum = sumArr[0];
        for (int i = 1; i < sumArr.length; i++) {
            if (sumArr[i] > maxNum) {
                maxNum = sumArr[i];
            }
        }
        System.out.println("Max number is: " + maxNum);

        sc.close();
    }
}
