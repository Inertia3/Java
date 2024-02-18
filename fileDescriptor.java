
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
public class fileDescriptor {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(FileDescriptor.in);
            int byteValue;

            System.out.println("Type some text and press Enter:");
            while ((byteValue = fis.read()) != -1) {
                System.out.print((char) byteValue);
            }

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

