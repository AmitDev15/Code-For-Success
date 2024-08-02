// 10.Write a program that prints the numbers from 1 to 10 using a for loop.
// 11.Write a program that prints the numbers from 1 to 10 using a while loop.
// 12.Write a program that prints the numbers from 1 to 10 using a do-while loop.
package julyFifteen;

public class PrintNumbersUsingLoop {
    public static void main(String[] args) {
        //Using For Loop
        for(int i = 1; i <= 10; i++){
            System.out.println("For Loop : " + i);
        }

        //Using While Loop
        int i = 1;
        while(i <= 10){
            System.out.println("While Loop : " + i);
            i++;
        }

        //Using Do-While Loop
        int j = 1;
        do{
            System.out.println("Do While Loop : " + j);
            j++;
        }while(j <= 10);
    }
}
