import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readfile {
    public static void main(String[]args){
        String filename ="file.txt";
    
        try{
            FileReader fr =new FileReader("file.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("reading content from file");
            while ((line=br.readLine())!=null) {
                System.out.println(line);
            
        }
        br.close();


    }catch(IOException e){
        System.out.println("redaing");
        e.printStackTrace();
    }
}
}