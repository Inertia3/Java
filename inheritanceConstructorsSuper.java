class Base{
    Base(){
        System.out.println("Base class constructor");
    }
    Base(int x){
        System.out.println("Base class constructor with value of x - "+x);
    }
}
class Derived1 extends Base{
    Derived1(){
        System.out.println("Derived1 class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("Derived class constructor with calue of y - "+y);
    }
}
class Derived2 extends Derived1{
    Derived2(){
        System.out.println("Derived2 class constructor");
    }
    Derived2(int x, int y, int z){
        super(x,y);
        System.out.println("Derived2 class constructor with value of z - "+z);
    }
}
public class inheritanceConstructorsSuper {
   public static void main(String args[]){
    Derived2 d2 = new Derived2(5,6,7);
   } 
}
