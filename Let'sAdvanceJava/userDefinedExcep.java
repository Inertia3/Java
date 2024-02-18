import java.util.Scanner;

class InvalidAgeException extends Exception{
    public String getMessage(){
        return "Invalid Age";
    }
}

public class userDefinedExcep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age - ");
        int age = sc.nextInt();

        try{
            if(age<18){
                throw new InvalidAgeException();
            }
            System.out.println("Age of Voter is - "+age);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
    }
}
