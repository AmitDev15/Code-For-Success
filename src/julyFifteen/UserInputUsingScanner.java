// 3.Write a program that asks the user to enter their name and age, then prints a greeting message that includes the entered name and age.
package julyFifteen;

import java.util.Scanner;

public class UserInputUsingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + " and your age is " + age);
        scanner.close();
    }
}

