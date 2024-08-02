// 15.Write a program that asks the user to enter a string and counts the number of vowels (a, e, i, o, u) in the string.
package julyFifteen;

import java.util.Scanner;

public class CountNumberOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String word = sc.nextLine();
        int count = 0;
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if(vowels.contains(String.valueOf(word.toLowerCase().charAt(i)))){
                count++;
            }
        }
        System.out.println("Total number of vowels: " + count);
        sc.close();
    }
}
