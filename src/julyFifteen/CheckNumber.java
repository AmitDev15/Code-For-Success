// 17.Write a program that asks the user to enter a number and checks if that number is present in an array.
package julyFifteen;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        int[] predefinedArray = {20, 54, 2, 45, 87, 10, 40, 25, 30, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check in array : ");
        int checkNumber = sc.nextInt();
        boolean isPresent = false;
        for (int i = 0; i < predefinedArray.length; i++) {
            if(checkNumber == predefinedArray[i]){
                isPresent = true;
                break;
            }
        }
        if(isPresent){
            System.out.println(checkNumber + " number found in an array");
        }else{
            System.out.println(checkNumber + " number not found in an array");
        }
        sc.close();
    }
}
