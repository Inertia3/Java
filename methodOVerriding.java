class Base{
    
    void methodOverriding(){
        System.out.println("Method of the Base class - ");
    }
}
class Derived{
    void methodOverriding(){
        System.out.println("Method of the Derived class - ");
    }
}
public class methodOVerriding {
    public static void main(String args[]){
        Derived d = new Derived();
        d.methodOverriding();
        Base b = new Base();
        b.methodOverriding();
    }
}
