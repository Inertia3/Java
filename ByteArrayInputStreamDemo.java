import java.io.ByteArrayInputStream;
// import javax.print.DocFlavor.INPUT_STREAM;

public class ByteArrayInputStreamDemo{
    public static void main(String[] args) {
        String s = "Sahil Ansari";
        byte b[] = s.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(b);
        int i;
        while((i=bais.read())!= -1){
            System.out.print((char)i);
        }
        System.out.println();
        ByteArrayInputStream bais1 = new ByteArrayInputStream(b, 2, 5);
        int j;
        while((j=bais1.read())!= -1){
            System.out.print((char)j);
        }
        System.out.println();

    }
}
