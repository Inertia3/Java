import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        // int a=5,b=3,c;
        // c=a+b;
        // System.out.println("The sum of a and b is:"+c);

        System.out.println("Taking user input-");
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number:");
        int a = sc.nextInt();

        System.out.print("Enter another number:");
        int b = sc.nextInt();
        
        int sum=a+b;
        System.out.print("The sum of two numbers is:"+sum);
        sc.close();
    }
}
