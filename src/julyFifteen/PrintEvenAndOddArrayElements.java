// 18.Write a program that asks the user for 10 numbers and stores them in an array. Then, print the even and odd numbers separately.
package julyFifteen;

import java.util.Scanner;

public class PrintEvenAndOddArrayElements {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Your entered array is: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println();
        System.out.print("Even number from an array : ");
        for (int num : arr) {
            if(num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("Odd number from an array : ");
        for (int num : arr) {
            if(num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}
