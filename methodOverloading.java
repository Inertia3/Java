public class methodOverloading {
    static void show(){
        System.out.println("Hello World!");
    }
    static void show(int a){
        System.out.println("Hello world!"+a);
    }
    static void show(int a,int b){
        System.out.println("Hello world!"+b);
    }
    void show(int a,int b,int c){
        System.out.println("Hello world!"+c);
    }
    public static void main(String[] args){
        show();
        show(100);
        show(100,1000);
        methodOverloading  m = new methodOverloading();
        m.show(100,1000,3000);
    }
}
// changing the return type will not make the method overloaded