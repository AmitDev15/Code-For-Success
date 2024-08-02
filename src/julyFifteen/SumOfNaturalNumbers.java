// 13.Write a program that asks the user for a number and prints the sum of the first N natural numbers using a loop.
package julyFifteen;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Sum of " + N + " natural numbers is: " + sum);
        sc.close();
    }
}
