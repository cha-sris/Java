import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    
    //  How to read a file using Java (3 popular options)
    //  BufferedReader + FileReader: Best for reading text files line-by-line
    //  FileInputStream: Best for binary files (eg. images, audio files)
    //  RandomAccessFile: Best for read/write specific portions of a large file

    public static void main(String[] args) {
        String filePath = "/home/archasris/Codes/Java/src/basics/test.txt";

        try (BufferedReader reader = new            BufferedReader(new FileReader(filePath));
        ){
            String line;
            
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found.");
        }
        catch(IOException e){
            System.out.println("Can't read the file.");
        }
    }
}
