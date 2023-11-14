package garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args) {
        try {
            // Read a text file into a String using + operator (creating garbage)
            String content = readTextFileWithGarbage("test.txt");
            System.out.println("Garbage created successfully. Length: " + content.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readTextFileWithGarbage(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        String content = "";

        while ((line = reader.readLine()) != null) {
            content += line; // Using + operator to concatenate strings (creates garbage)
        }

        reader.close();
        return content;
    }
}