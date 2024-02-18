// write a program that allows you to keep accessing an array 
// until a valid index is given by user

import java.util.Scanner;
public class exception2 {
    public static void main(String[] args) {
        int [] arr =new int[3];
        arr[0] = 4;
        arr[1] = 8;
        arr[2] = 12;
        boolean flag = true;
        while(flag){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the index of array for divison - ");
        int a  = sc.nextInt();
        try{
            try{
                 int div = arr[a]/2;
                 flag = false;
                 System.out.println("result = "+div);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        catch(Exception e1){
                System.out.println(e1);
            }
        sc.close();
    }
    System.out.println("End of the Program");
    }
}

