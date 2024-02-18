/*Define a class MyThread that inherits Thread. 
In run() method, print the state of the thread. 
In main method create instance if the MYThread. 
Show its New State, Runnable state and after execution state, Show the terminated state */

class MyThread extends Thread {

    public void run(){
        System.out.println("Hii I'm Thread");
        System.out.println(Thread.currentThread().getState());
    }
}
public class Evaluation3{
    public static void main(String[] args){
        try{
            MyThread t1 = new MyThread();
        // State of thread before starting the Thread
        System.out.println("State of Thread before running - "+t1.getState());

        // State of thread While running
        t1.start();
        System.out.println("State of Thread while running - "+t1.getState());

        // State of thread after Termination
        t1.join();
        System.out.println("State of Thread After running - "+t1.getState());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

