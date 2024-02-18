
interface First {
    public void method1();
}
interface Second extends First{
    public void method2();
}
class Sample implements Second{
    public void method1(){
        System.out.println("Method1");
    }
    public void method2(){
        System.out.println("Method2");
    }
}
public class inheritanceInInterfaces {
    public static void main(String args[]){
        Sample obj = new Sample();
        obj.method1();
        obj.method2();

    }
}
