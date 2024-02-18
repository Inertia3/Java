import java.util.Scanner;
public class exceptionFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Enter two numbers - ");
              int a = sc.nextInt();
              int b = sc.nextInt();
              try{
                int result = a/b;
                System.out.println("a/b = "+result);
                flag = false;
                break;
              }
              catch(Exception e){
                e.printStackTrace();
              }
              finally{
                System.out.println("End of the program");
              }
              sc.close();
        }
    }
}
