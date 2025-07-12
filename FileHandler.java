import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    public static void main(String[] args) {
        File myFile = new File("file.txt");
        try {
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter fw = new FileWriter(myFile);
            BufferedWriter bw= new BufferedWriter(fw);

            bw.write("java lol");
            bw.newLine();
            bw.write("codeing dmmm");
            bw.newLine();
            bw.close();
            System.out.println("content written to the file");


        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    
    }
}
