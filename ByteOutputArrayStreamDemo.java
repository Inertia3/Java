import java.io.ByteArrayOutputStream;

public class ByteOutputArrayStreamDemo {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream boas = new  ByteArrayOutputStream();

        // byte[] b = {'1','2','3','4','5','6'};
        String s1 = "Sahil Ansari";
        byte b[] = s1.getBytes();

        for(byte a : b){
            boas.write(a);
        }
        for(byte c : boas.toByteArray()){
            System.out.print((char)c);
        }
        System.out.println();
        int size = boas.size();
        System.out.println("Size of BOAS stream = "+size);
        String s = boas.toString();
        System.out.println("Content of BOAS = "+s);
        boas.close();
    }
}
