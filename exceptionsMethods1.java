//overloading exception class meethods to make custom display messeges

import java.util.Scanner;

class MyException extends Exception{

    @Override
    public String toString(){
        // return super.toString()+ "Arithematic Exception Occured";
        return "Arithematic Exception Occured";
    } 

    @Override
    public String getMessage(){
        // return super.getMessage()+" Exception due to / by 0";
        return "Exception due to / by 0";
    }
    @Override
    public void printStackTrace(){
        toString();
        getMessage();
        System.out.println("Exception occured at line 25");
    }
}
public class exceptionsMethods1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter two numbers-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        MyException m = new MyException();
        if(a==0||b==0){
        try{
            // throw new MyException();  // throwing ht eexception object 
            throw m;
        }
        catch(Exception e){
            System.out.println("getMessage-");
            System.out.println(e.getMessage());
            System.out.println("toString-");
            System.out.println(e.toString());
            System.out.println("e-");
            System.out.println(e);
            System.out.println("printStackTrace-");
            e.printStackTrace();
        }
    }
    else{
        System.out.println("a/b = "+a/b);
    }
    }
}
