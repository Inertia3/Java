class Base{
    public int x;
    // creating a setter
     public void setX(int x){
            System.out.println("Inside base class");
            this.x = x;
        }
        // creating a getter
        public int getX(){
            return x;
        }
       
}
class Derived extends Base{
     public int y;
     // creating a setter
        public void setY(int y){
            System.out.println("Inside derived class");
            this.y = y;
        }
        // creating getter
        public int getY(){
            return y;
        }
        
}
public class inheritance1 {
    public static void main(String args[]){
        // accessing x using base class
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());

        //accessing x using derived class
        Derived d = new Derived();
        d.setX(6);
        System.out.println(d.getX());

        // accessing y using derived clas only

        Derived d1 = new Derived();
        d1.setY(7);
        System.out.println(d1.getY());
    }   
}

