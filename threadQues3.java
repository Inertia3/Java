// Demonstrate getPriority and setPriority
// methods in java threads

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
public class threadQues3 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        // normal priority is 5
        // maximum priority is 10
        // minimum priority is 1
        t1.start();
        t1.setPriority(8);
        System.out.println("Thread 1 Custom priority is- "+t1.getPriority());
        t2.start();
        System.out.println("Thread 2 Normal priority is- "+ t2.getPriority());
    }
}
