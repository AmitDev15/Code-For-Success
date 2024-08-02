// 5.Write a program that initializes an array of 5 integers and prints each element using a loop.

package julyFifteen;

public class PrintArrayElements {
    public static void main(String[] args) {
        int newArr[] = {10, 15, 20, 25, 30};
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("Element " + newArr[i] + " is at index " + i);
        }
    }
}
