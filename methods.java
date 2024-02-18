import java.util.Scanner;
public class methods {
    // static void add(int a,int b){
    //     int x=a;
    //     int y=b;
    //     int sum=x+y;
    //     System.out.printf("The sum of %d and %d is:%d",x,y,sum);
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int p,q;
    //     System.out.println("Enter two numbers to add them:");
    //     p = sc.nextInt();
    //     q = sc.nextInt();
    //     add(p,q);
    //     sc.close();
    // }
    // now if you do not want to use static methods here how can you do it
    int add(int a,int b){
        int x=a;
        int y=b;
        int sum=x+y;
        x=90;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        methods m = new methods();                 //creating object of the super class to call the methods 
        int p,q;
        System.out.println("Enter two numbers to add them:");
        p = sc.nextInt();
        q = sc.nextInt();
        int summ=m.add(p,q);
        System.out.printf("\nThe sum of %d and %d is:%d",p,q,summ);
        System.out.println();
        System.out.println("Inside main method values of a and b is not changed:"+p+" "+q);
        sc.close();
        }
 }
