import java.util.Random;
import java.util.Scanner;

public class Array {
    // Method to generate a 2D array of random integers
    private static int[][] generateRandomArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(100); // Generating random integers between 0 and 99
            }
        }
        return array;
    }

    // Method to display the contents of the 2D array
    private static void displayArray(int[][] array) {
        System.out.println("Generated 2D Array:");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Method to find and display the sum of all elements in the array
    private static void displaySum(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }

    // Method to find and display the maximum value in the array
    private static void displayMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] row : array) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        System.out.println("Maximum value: " + max);
    }

    // Method to find and display the minimum value in the array
    private static void displayMin(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int[] row : array) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }
        System.out.println("Minimum value: " + min);
    }

    // Method to transpose the 2D array
    private static int[][] transposeArray(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        int[][] transposedArray = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }
        return transposedArray;
    }

    // Main method to coordinate the flow of the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        
        int[][] array = generateRandomArray(rows, columns); // Generating the 2D array
        
        displayArray(array); // Displaying the contents of the array
        displaySum(array); // Displaying the sum of all elements
        displayMax(array); // Displaying the maximum value
        displayMin(array); // Displaying the minimum value
        
        int[][] transposedArray = transposeArray(array); // Transposing the array
        System.out.println("Transposed 2D Array:");
        displayArray(transposedArray); // Displaying the transposed array
        
        scanner.close();
    }
}
