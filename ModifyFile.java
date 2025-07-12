import java.io.*;
import java.util.*;

public class ModifyFile {
    public static void main(String[] args) {
        String filename = "file.txt";
        List<String> lines = new ArrayList<>();

        // Step 1: Read file and store lines with replacements
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = br.readLine()) != null) {
                // Replace word "lol" with "rocks"
                line = line.replace("lol", "rocks");
                lines.add(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }

        // Step 2: Write modified lines back to file
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            for (String modifiedLine : lines) {
                bw.write(modifiedLine);
                bw.newLine();
            }
            bw.close();
            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }
}
