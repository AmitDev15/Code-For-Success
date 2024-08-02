// 2.Write a program that converts a double value to an integer and prints both the original and converted values.
package julyFifteen;

public class DatatypesTypeCasting {
    public static void main(String[] args) {
        double unchangedValue = 45.6879;
        System.out.println("Value before casting to int : " + unchangedValue);
        int changedValue = (int) unchangedValue;
        System.out.println("Value after casting to int : " + changedValue);
    }
}
