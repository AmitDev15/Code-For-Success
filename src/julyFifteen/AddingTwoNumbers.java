// 4.Write a program that prompts the user to enter two numbers and prints their sum.
package julyFifteen;

import java.util.Scanner;

public class AddingTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = in.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = in.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("The sum is " + sum);
        in.close();
    }
}
