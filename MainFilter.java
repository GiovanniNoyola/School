import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFilter {

    // Define the file path
    private static final String FILE_PATH = "words_alpha.txt";

    // Method to read words from a text file and store them in an ArrayList
    private static ArrayList<String> readWordsFromFile(String filePath) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        scanner.close();
        return words;
    }

    // Method to filter words based on length and print them
    private static void filterWordsByLength(ArrayList<String> words, int length) {
        boolean found = false;
        System.out.println("Words with length " + length + " are:");
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No words with length " + length + " found.");
        }
    }

    // Main method to coordinate the flow of the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Prompt user for input
            System.out.print("Enter the length of words to filter by: ");
            int length = scanner.nextInt();
            if (length <= 0) {
                throw new IllegalArgumentException("Length must be a positive integer.");
            }
            // Read words from file and filter
            ArrayList<String> words = readWordsFromFile(FILE_PATH);
            filterWordsByLength(words, length);
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.out.println("File not found: " + FILE_PATH);
        } catch (Exception e) {
            // Handle other exceptions including invalid input
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            // Close the scanner
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
