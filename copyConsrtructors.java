// import java.util.Scanner;

class employee{
    private String name="Ansari";  //instance variable
    private int id=003;
    employee(){
        System.out.println("Copy Constructor");
    }
    employee(String s,int i){  //local variable

        this.name=s;
        this.id=i;
        // System.out.println("Name="+name+"  Id="+id);
    }
    void show(){
        System.out.println("Name="+name+"  Id="+id);
    }
}

public class copyConsrtructors {

    public static void main(String[] args){
  //to access the instance variable we use this keyword which refers to the current class object
  employee em = new employee("Sahil",12);
  em.show();
  employee em1=em;
  em1.show();
    } 
}

