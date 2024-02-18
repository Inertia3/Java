import java.util.Scanner;
public class exp22 {
        public static boolean checkReverse(int n){
            int rev = 0;
            int rem;
            int n1 = n;
            while(n1!=0){
                rem = n1%10;
                rev = rev*10+rem;
                n1 = n1/10;
            }
            if(n == rev){
                return true;
                
            }
            else
            return false;
       }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number - ");
    int a = sc.nextInt();
    System.out.println("The entered number "+a+" is palindrome - "+checkReverse(a));
    sc.close();
   }
}