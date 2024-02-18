

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) throws IOException{

            File fileName = new File("aaa.txt");
            FileOutputStream fos = new FileOutputStream(fileName);
            FileInputStream fis = new FileInputStream(fileName);
            String s = "Sahil Ansari";
            byte b[] = s.getBytes();
            fos.write(b);
            int i;
            while((i = fis.read()) != -1){
                System.out.print((char)i);
            }
            // String s1 = fis.toString();
            // System.out.println(s1);
            fos.close();
            fis.close();
        }
    }


