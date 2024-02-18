import java.util.*;

class Parent{

    String childName = "Stark";

}

class Children extends Parent{
    
    Children(){
        String childName = "Robert";
        System.out.println("Child Name is - " +super.childName);

        System.out.println("Child Name is - "+childName);
    }
}

public class superKey extends Children{
    
    superKey(){


        //calling base class constructors
        super();
        String childName = "Tony";
        System.out.println("Child Name is - "+childName);
    }


    public static void main(String[] args) {
        System.out.println("Inside main");

        new superKey();
    }
}