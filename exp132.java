class Mammal{
    void move(){
        System.out.println("method of the Mammal class");
    }
}
class Man extends Mammal{
    void move(){
        System.out.println("Overridden method of Mammal class");
    }
}
public class exp132 {
    public static void main(String[] args) {
        // Mammal ma = new Mammal();
        // ma.move();

        Man mn = new Man();
        mn.move();
    }
}
