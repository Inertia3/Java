import java.util.Scanner;

public class fibonacci{
    int i = 1;

    public int nthFibo(int n){
        System.out.println("stack space - "+ i++);
        if(n<=1){
            return n;
        }
        int last = nthFibo(n-1);
        int secondlast = nthFibo(n-2);

        return last + secondlast;
    }
    public static void main(String[] args) {
        
        System.out.print("Enter the position - ");
        Scanner sc = new Scanner(System.in);
        fibonacci f  = new fibonacci();
        int x = sc.nextInt();
        int ans = f.nthFibo(x);
        System.out.println(x+"th Fibonacci = "+ans);
        sc.close();
    }
}