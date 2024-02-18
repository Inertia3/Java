import java.util.Scanner;
public class constructors1 {
    
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
        System.out.println("The sum of two numbers is:"+sum);
        sc.close();
        sum s=new sum(5);  //calling the counstructor    //constructor cannot be static final and abstract  
        // s.method();       //calling the methods      
        sum s1=new sum(4,6);
        // s1.method();
     
    }
}
class sum{
    sum(){
        System.out.println("\nConstructor of class sum");
    }
    sum(int a){
        System.out.println("Parameterized Constructor called- a="+a);
    }
    sum(int c,int d){
        System.out.printf("Parameterized Constructor called-a=%d and b=%d",c,+d);
    }
    void method(){
        System.out.println("\nMethod of class sum");
    }
}
//object class is the super class of all the classes
//any class we create in java are derived from object class