import java.util.Arrays;
import java.util.Random;

public class HelloWorld {
    // Method to generate an array of random integers
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Generating random integers between 0 and 99
        }
        return array;
    }

    // Method to implement the bubble sort algorithm
    private static void bubbleSort(int[] array) {
        int n = array.length;
        int comparisons = 0;
        int swaps = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (array[j] > array[j + 1]) {
                    // Swap if the current element is greater than the next one
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaps++;
                }
            }
            // Display the array after each pass
            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(array) + " (Comparisons: " + comparisons + ", Swaps: " + swaps + ")");
        }
    }

    // Method to display the elements of the array
    private static void displayArray(int[] array) {
        System.out.println("Original Array: " + Arrays.toString(array));
    }

    // Main method to coordinate the flow of the program
    public static void main(String[] args) {
        int[] array = generateRandomArray(5); // Generating an array of size 5
        displayArray(array); // Displaying the original array
        bubbleSort(array); // Sorting the array using bubble sort
        // Displaying the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
