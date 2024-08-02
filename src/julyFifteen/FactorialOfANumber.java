// 19.Write a program that asks the user for a number and calculates its factorial using a loop.
package julyFifteen;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number user factorial you want : ");
        int userInput = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= userInput; i++) {
            factorial *= i;
        }
        System.out.print("Factorial of " + userInput + " is: " + factorial);
    }
}
