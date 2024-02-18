import java.io.IOException;
import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try{
            // File newFile = new File("aaa.txt");
            // atttaching file to the input stream to read
            FileInputStream fis = new FileInputStream("abc.txt");
            // reading a single character from file
            // int i  = fis.read();
            // System.out.println((char)i);

            // reading every content from the file
            int i = 0;
            while((i=fis.read()) != -1){ // fis.read gives -1 when file is empty
                System.out.println((char)i);
            }
            fis.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
