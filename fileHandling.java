import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java .util.Scanner;
public class fileHandling {


    // one of the way to create a file 
    // public static void main(String[] args) throws IOException {
    //     // code to create a new file 
    //     File myFile = new File ("abc.txt");
    //     myFile.createNewFile();
    //     }
    // }
    public static void main(String[] args) {
        //code to create anew file
        File myFile = new File("abc.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unalbe to create file");
            e.printStackTrace();
        }

        // code to write inside a file
        try {
            FileWriter file = new FileWriter("abc.txt");
            file.write("This is my first file in java");
            file.close();
        } 
        catch (IOException e) {
            System.out.println("Unable to write inside the file");
            e.printStackTrace();
        }

        //Reading from a file
        // File myFile = new File("abc.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // deleting a file
        File myNewFile = new File("aaa.txt");
        if(myNewFile.delete()){
            System.out.println("I have deleted the file "+myFile.getName());
        }
        else{
            System.out.println("File not deleted");
        }
    }
}
