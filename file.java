import java.io.FileInputStream;
import java.io.FileOutputStream;

public class file {
    public static void main(String[] args) throws Exception{
        FileOutputStream fs = new FileOutputStream("abc.txt");
        // fs.write(65);
        String s = "sahil ansari";
        byte [] arr = s.getBytes();
        fs.write(arr);
        fs.flush();
        fs.close();
        System.out.println("File Successfully Created");
        FileInputStream fi = new FileInputStream("abc.text");
        int i = fi.read();
        while(i != -1){
            System.out.println((char)i);
            i = fi.read();
        }
        fi.close();
        // FileOutputStream fs1 = new FileOutputStream("abc1.txt");

    }
}
