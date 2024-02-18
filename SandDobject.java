import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
    private String name;
    private int age;
    transient private float salary;
    // static int duration = 3;

    Employee(String name, int age, float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    void display(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("salary = "+salary);
        // System.out.println("Duration = "+duration);
    }
}
public class SandDobject {
    public static void main(String[] args) {
        try{
                Employee emp = new Employee("Sahil Ansari", 20, 231);

                // Creating a file
                FileOutputStream fos = new FileOutputStream("AserFile.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(emp);
                oos.close();
                fos.close();
                System.out.println("Object serialised");

                //Deserialising the object
                FileInputStream fis = new FileInputStream("AserFile.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);

                Employee e1 = (Employee) ois.readObject();
                e1.display();
                // System.out.println(e1.duration);
                System.out.println("Object Deserialised");
                fis.close();
                ois.close();
        }        
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

