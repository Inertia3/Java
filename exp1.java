import java.util.Scanner;
class employee{
    String name;
    long yearOfJoining;
    double salary;
    String address;

    employee(String s, long i, double n, String y){
        this.name = s;
        this.yearOfJoining = i;
        this.salary = n;
        this.address = y;
    }
    void displayInfo(){
        System.out.println("Employee Information - ");
        System.out.println("Name - "+name);
        System.out.println("Year of joining - "+yearOfJoining);
        System.out.println("Salary - "+salary);
        System.out.println("Address - "+address);
    }
}
public class exp1 {
    public static void main(String args[]){
        String s;
        long i;
        double n;
        String f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name of the Employe - ");
        s = sc.nextLine();
        System.out.print("Enteer the Year of joining - ");
        i =sc.nextLong();
        System.out.print("Enter the salary of the Employee - ");
        n = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter the address of the Employee - ");
        f = sc.nextLine();
        employee e = new employee(s,i,n,f);
        e.displayInfo();
        sc.close();
    }
}
