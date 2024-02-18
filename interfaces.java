interface MyWifi{
    public void wifi();
}
interface MyGames{
    public void games();
}
interface MyCamera{
    public void camera();
    public default void Recording(){
        System.out.println("Recording in 4k");
    }
}
class Cellphone{
    public void contacts(){
        System.out.println("Calling Sahil");
    }
    public void pickCalls(){
        System.out.println("Picking ip calls");
    }
}
class MySmartphone extends Cellphone implements MyWifi, MyGames, MyCamera{
    public void playVideo(){
        System.out.println("Playing video");
    }
    public void playMusic(){
        System.out.println("Playing music");
    }
    // implementing functions of interfaces
        public void wifi(){
            System.out.println("Connected to wifi");
        }
        public void games(){
            System.out.println("playing games");
        }
        public void camera(){
            System.out.println("Taking snaps");
        }
        // default methods can also be overloaded
        public void Recording(){
        System.out.println("Recording in 4k in My Smartphone"); 
    }
}
public class interfaces{
    public static void main(String[] args) {
        MySmartphone obj = new MySmartphone();
        obj.wifi();
        obj.games();
        obj.camera();
        obj.contacts();
        obj.pickCalls();
        obj.Recording();
    }
}
