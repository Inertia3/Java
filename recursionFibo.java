import java.util.Scanner;
public class recursionFibo {
    static int fibo(int r){
        int sum=0;
        int j=1;
        int k=1;
      for(int i=0; i<r; i++){
        sum=i+fibo(i+1);
      }
      return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in the fibonacci series:");
        int r=sc.nextInt();
        int x=fibo(9);
        System.out.printf("The sum of fibonacci series consisting of %d elements is:%d",r,x);
        sc.close();
    }
}
