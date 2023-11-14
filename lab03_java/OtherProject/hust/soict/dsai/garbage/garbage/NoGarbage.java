package garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) {
    	System.out.println("Current Directory: " + System.getProperty("user.dir"));

        try {
            // Read a text file into a String using StringBuffer (no garbage)
            String content = readTextFileWithoutGarbage("test.txt");
            System.out.println("No garbage created successfully. Length: " + content.length());
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Method to read a text file into a String using StringBuilder (no garbage)
    private static String readTextFileWithoutGarbage(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line;

            // Read each line from the file and append using StringBuilder (efficient, no garbage)
            while ((line = reader.readLine()) != null) {
                sb.append(line); // Using StringBuilder to concatenate strings (no garbage)
            }

            return sb.toString();
        }
    }
}

