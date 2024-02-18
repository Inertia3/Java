abstract class Base{
    public Base(){
        System.out.println("Hello Everyone");
    }
    public void Situation(){
        System.out.println("kal exam h aur abhi tak syllabus nhi hua");
    }
    abstract void whatToDo();
} 
class Derived extends Base{
    public void whatToDo(){
        System.out.println("Padho raat bhar tab ");
    }
}
abstract  class Derived1 extends Base{
    public void Solution(){
        System.out.println("Koi aur rasta nhi h??");
    }
}
public class abstractMethodAndClass {
    public static void main(String args[]){
        Derived d = new Derived();
        d.Situation();
        d.whatToDo();
        // Derived1 d1 = new Derived1();
        // d1.Solution();
        // Base b = new Base();

        // will throw error because of abstract

    }
}
