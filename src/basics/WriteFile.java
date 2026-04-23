import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    //  How to write a file using Java (4 popular options)

    //  FileWriter = Good for small or medium-sized text files
    //  BufferedWriter = Better performance for large amounts of text
    //  PrintWriter = Best for structured data, like reports or logs
    //  FileOutputStream = Best for binary files (eg. images, audio files)
    public static void main(String[] args) {

        String filePath = "/home/archasris/Codes/Java/src/basics/test.txt";
        String textContent = "I like pizza!\nIt's really good\nBuy me pizza.";
       try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written successfully to: " + filePath);
       }
       catch(FileNotFoundException e){
            System.out.println("Could not locate the file location.");
       }
        catch (IOException e) {
            System.out.println("Could not write file.");
        }

    }
}
