
public class exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("a/b = " +c);
        }
        catch(ArithmeticException e){
            // System.out.println("Cannot divide a number by zero");
            System.out.println("Compiler Statement - "+e);
        }
        System.out.println("End of program");
    }
}
