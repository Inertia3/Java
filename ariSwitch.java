import java.util.Scanner;
public class ariSwitch {
    public static void main(String args[]){
         int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation you want to perform - ");
        x = sc.nextInt();
        switch(x){
            case 1:
            System.out.println("Enter two numbers - ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum of a and b is = "+(a+b));
            break;
            case 2:
            System.out.println("Enter two numbers - ");
            float c = sc.nextFloat();
            float d = sc.nextFloat();
            System.out.println("Product of a * b is = "+(c*d));
            break;
            case 3:
            System.out.println("Enter two numbers - ");
            long e = sc.nextLong();
            long f = sc.nextLong();
            System.out.println("Divison of a/b is  = "+(e/f));
            break;
            case 4:
            System.out.println("Enter two numbers - ");
            short g = sc.nextShort();
            short h = sc.nextShort();
            System.out.println("Modulus of a%b is = "+(g%h));
            break;
            default:
            System.out.println("End of the Program");
        }
        sc.close();
    }
}
