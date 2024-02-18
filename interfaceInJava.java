interface Bicycle{
    int a = 10;  // cannot be modified as it is final;
    void applyBrake(int decrement);
    void speedUp(int incrementr);
}
interface MotorCycle{
    void Brand();
    void price();
}
class AvonCycle implements Bicycle{
    public void BlowHorn(){
        System.out.println("Pe pe po po");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brakes "+decrement);
    }
    public void speedUp(int increment){
        System.out.println("Speeding up"+increment);
    }

    public void Brand(){
        System.out.println("Royal Enfield Classic 350");
    }
    public void price(){
        System.out.println("2.5 LAkhs");
    }
}
public class interfaceInJava {
    public static void main(String args[]){
        AvonCycle a1 = new AvonCycle();
        a1.BlowHorn();
        a1.applyBrake(60);
        a1.speedUp(100);
        System.out.println(a1.a);
        // a1.a = 50;
        a1.Brand();
        a1.price();
    }

}
