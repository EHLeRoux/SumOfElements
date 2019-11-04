package Easy;
//Author: Eduard Le Roux
import java.util.Scanner;

/**
 * 
 * This class creates a 2D array where the user can select the size. 
 * The user then fills in the array with double's. 
 * The program asks the user which column they want to sum and the program 
 * supplies the sum of that column along with the sum of all the other columns.
 * 

 */

public class sumElements {
    public sumElements() {
    }

    public static double[][] Array(int rows, int colums) {
        double[][] array = new double[rows][colums];
        return array;
    }

    public static double[][] fillArray(double[][] array) {
        Scanner userInput = new Scanner(System.in);

        for(int i = 0; i < array.length; ++i) {
            for(int j = 0; j < array[0].length; ++j) {
                System.out.println("Please enter your numbers here:");
                array[i][j] = userInput.nextDouble();
            }
        }

        return array;
    }

    public static void printArray(double[][] array) {
        for(int i = 0; i < array.length; ++i) {
            for(int j = 0; j < array[0].length; ++j) {
                System.out.print(array[i][j] + " | ");
            }

            System.out.println();
        }

    }

    public static double sumOfColumn(int x, double[][] array) {
        double sumTotal = 0.0D;

        for(int i = 0; i < array.length; ++i) {
            sumTotal += array[i][x];
        }

        System.out.println("The total sum for col " + x + " is " + sumTotal);
        System.out.println(" ");
        return sumTotal;
    }

    public static double sumOfColumn(double[][] array) {
        double sumTotal = 0.0D;

        for(int i = 0; i < array[0].length; ++i) {
            for(int j = 0; j < array.length; ++j) {
                sumTotal += array[j][i];
            }

            System.out.println("Totalsum for colum " + i + " is " + sumTotal);
            sumTotal = 0.0D;
        }

        return sumTotal;
    }

    public static void main(String[] args) {
        int rows = 3;
        int col = 3;
        Scanner size = new Scanner(System.in);
        System.out.println("Choose amount of rows: ");
        rows = size.nextInt();
        System.out.println("Choose amount of columns: ");
        col = size.nextInt();
        double[][] array = Array(rows, col);
        array = fillArray(array);
        printArray(array);
        System.out.println("Choose the column you want the sum of: Please note that all the column total sums will be calculated after this :)");
        int colSelection = size.nextInt();
        sumOfColumn(colSelection, array);
        sumOfColumn(array);
    }
}
