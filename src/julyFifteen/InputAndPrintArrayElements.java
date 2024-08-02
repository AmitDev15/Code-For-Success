// 6.Write a program that asks the user to enter 5 integers, stores them in an array, and prints the array.
package julyFifteen;

import java.util.Scanner;

public class InputAndPrintArrayElements {
    public static void main(String[] args) {
        int[] newArr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            newArr[i] = sc.nextInt();
        }
        System.out.println("Your entered array is: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        sc.close();
    }
}