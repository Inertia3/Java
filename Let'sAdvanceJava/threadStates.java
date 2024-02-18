class MyThread extends Thread{
    public void run(){
        System.out.println("Hello! I am a thread");
    }
}
public class threadStates {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();

        System.out.println("State of thread before running - "+Thread.currentThread().getState());
        
        mt.start();

        System.out.println("State of thread after start - "+ mt.getState());
        mt.sleep(2000);
        System.out.println("State of thread after sleep -"+mt.getState());
        mt.join();
        System.out.println("State of thread after running - "+mt.getState());
        

    }
}
