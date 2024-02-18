// How do you get reference to the current threwad in java

class Thread1 extends Thread{
    public void run(){
        int i=0;
        while(i<1){
            System.out.println("Thread 1 Running ");
            i++;
        }
    }
} 

class Thread2 extends Thread{
    public void run(){
        int j = 0;
        while(j<1){
         System.out.println("Thread 2 Running ");
         j++;
        }
    }
}
public class threadQues5 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        // normal priority is 5
        // maximum priority is 10
        // minimum priority is 1
        try{
            t1.start();
            Thread.sleep(200);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("State of thread t1- "+t1.getState());
        t2.start();
        System.out.println("Current State of thread t2- "+Thread.currentThread().getState());
    }
}

