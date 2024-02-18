import java.util.Scanner;

public class exception1 {
    public static void main(String[] args) {
        int [] arr =new int[3];
        arr[0] = 4;
        arr[1] = 8;
        arr[2] = 12;
        int c = arr.length;
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the index of array for divison - ");
        int a  = sc.nextInt();
        System.out.print("Enter the number to divide array element - ");
        int b = sc.nextInt();
        try{
            try{
                 int div = arr[a]/b;
                 System.out.println("result = "+div);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        catch(ArithmeticException e1){
                System.out.println(e1);
            }
        catch(Exception e){
            System.out.println("Some other exception Occured - "+e);
        }
            sc.close();
    }
}
