import java.util.Scanner;
class student{
    public String name;
    public int id;
    public void getInfo(String s, int n){
        name=s;
        id=n;
    }
    public void setInfo(){
        System.out.println("Student details are-\n"+"Name-"+name+"\nId-"+id);
    }
}
public class accessModifiers {
    public static void main(String args[]){
        // String nam;
        // int i;
        student st = new student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student-");
        st.name = sc.nextLine();
        System.out.println("Enter the id of the student-");
        st.id = sc.nextInt();
        st.getInfo(st.name,st.id);
        st.setInfo();
        sc.close();
    }
}  
