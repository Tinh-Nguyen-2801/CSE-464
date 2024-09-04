package lib;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileReaderExample <filename>");
            return;
        }

        String filename = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("- From Java");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

