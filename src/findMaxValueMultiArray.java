import java.util.Scanner;

public class findMaxValueMultiArray {
    public static void main(String[] args) {
        int[][] array;
        int row;
        int column;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of row matrix:");
        int size_row = input.nextInt();
        System.out.println("Enter the size of column matrix:");
        int size_column = input.nextInt();
        array = new int[size_row][size_column];
        System.out.println("Enter " + array.length + " rows and " +
                array[0].length + " columns: ");

        for (row = 0; row < array.length; row++) {
            for (column = 0; column < array[row].length; column++) {
                System.out.printf("Enter element [%d][%d]:", row, column);
                int value = input.nextInt();
                array[row][column]=value;
            }
        }
        System.out.println("Array:");
        for (row = 0; row < array.length; row++) {
            for (column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("max value in array: "+findMaxValue(array));
    }

    public static int findMaxValue(int[][] array) {
        int maxValue;
        maxValue = array[0][0];
        int row;
        int column;
        for (row = 0; row < array.length; row++) {
            for (column = 0; column < array[row].length; column++) {
                if (array[row][column] > maxValue) {
                    maxValue = array[row][column];
                }
            }
        }
        return maxValue;
    }
}
