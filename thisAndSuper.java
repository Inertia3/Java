class Base{
    int a;
    int getA(int a){
        return a;
    }
    Base(int a){
        this.a = a;
    }
}
class Derived extends Base{
    Derived(int b){
        super(5);  // i want to claa super class constructor having one argument
        System.out.println("Derived class constructor - "+b);
    }
}
public class thisAndSuper {
    public static void main(String args[]){
        Base b = new Base(5);
        Derived d = new Derived(68);
        System.out.println(d.getA(65));
    }
}
