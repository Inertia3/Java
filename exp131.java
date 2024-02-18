class Parent{
    void display1(){
        System.out.println("Method of Parent  class");
    }
}
class Child extends Parent{
    void display2(){
        System.out.println("Method of Child Class");
    }
}
public class exp131 {
    public static void main(String[] args) {
        Parent p = new Parent();
        // Calling methods of parent class using object of parent class 
        p.display1();
        Child c = new Child();
        // Calling methods of child class using object of child class 
        c.display2();
        // Calling methods of parent class using object of child class
        c.display1();
        }
    }
