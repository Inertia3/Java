public class thisKey {


    int x = 5;

    thisKey(){
        this(10);
        x = 20;
        System.out.println("Inside defeult constructor");
        System.out.println("The value of x - "+x);
    }

    public thisKey(int x) {
        this.x = x;

        System.out.println("Inside Parameterized Constructor");
        System.out.println("the value of x - "+x);
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        new thisKey();
    }
    
}
