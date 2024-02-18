package accessModifier;

public class sahil1{
    int a = 10; //default
    public int b = 20; //public
    protected int c = 30; //protected
    private int d = 40; //private 
    void method(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    }
    public static void main(String[] args) {
        sahil1 s = new sahil1();
        s.method();
        System.out.println("Inside sahil1 class");
    }
}
