// Write a program to print Hello during
// arithematic exception and World during 
// Illegle argument exception
import java. util. Scanner;
public class exceptionQues1 {
    public static int divide(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int result = divide(a,b);
            System.out.println("Result = "+result);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        catch(IllegalArgumentException e1){
            e1.printStackTrace();
        }
        sc.close();
    }
}
