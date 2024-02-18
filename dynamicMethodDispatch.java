class Phone{
    void Brand(){
        System.out.println("Nokia");
    }
    void Model(){
        System.out.println("Nokia 1200");
    }
    void ShowTime(){
        System.out.println("It is 12:30 am in Nokia");
    }
}
class SmartPhone extends Phone{
    void Brand(){
        System.out.println("Samsung");
    }
    void Model(){
        System.out.println("Samsung S20 Ultra");
    }
    void Music(){
        System.out.println("Play music");
    }
}
public class dynamicMethodDispatch {
    public static void main(String args[]){
        Phone obj = new SmartPhone();

        obj.Brand();
        obj.Model();
        // obj.Music(); throws error
        obj.ShowTime();
    }
    // crux of the situation is that the overridedne methods and the methods of the base class will be called only
}
