// 14.Write a program that asks the user for a number and prints its multiplication table up to 10.
package julyFifteen;

import java.util.Scanner;

public class MultiplicationTableOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose table you want : ");
        int number = sc.nextInt();
        System.out.println("Below is the table of number : " + number);
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
        sc.close();
    }
}
