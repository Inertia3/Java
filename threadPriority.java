class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(true){
            System.out.println("I am a thread");
            System.out.println("Name of thread - "+this.getName());
            System.out.println("Id of thread - "+this.getId());
            i++;
        }
    }
}
public class threadPriority{
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Sahil11");
        MyThread t2 = new MyThread("Sahil22");
        MyThread t3 = new MyThread("Sahil33");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t3.setPriority(Thread.NORM_PRIORITY);
        t3.start();
        // System.out.println("The id of the Thread is - "+t1.getId());
        // System.out.println("The name of the Thread is - "+t1.getName());
    }
}
