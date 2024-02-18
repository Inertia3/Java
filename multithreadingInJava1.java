class threadingRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<100){
             System.out.println("M416 Shooting");
             System.out.println("In automatic mode");
             i++;
        }
    }
}
class threadingRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<100){
             System.out.println("AWM shooting");
             System.out.println("In single mode");
             i++;
        }
    }
}
public class multithreadingInJava1 {
    public static void main(String[] args) {
        threadingRunnable1 bullet1 = new threadingRunnable1();
        Thread gun1 = new Thread(bullet1);

        threadingRunnable2 bullet2 = new threadingRunnable2();
        // Thread gun2 =
         new Thread(bullet2).start();

        gun1.start();
        // gun2.start();
    }
}

