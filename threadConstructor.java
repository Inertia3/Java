class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("I am a thread");
            System.out.println("Name of thread - "+this.getName());
            System.out.println("Id of thread - "+this.getId());
            i++;
        }
    }
}
public class threadConstructor {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Sahil");
        t1.start();
        // System.out.println("The id of the Thread is - "+t1.getId());
        // System.out.println("The name of the Thread is - "+t1.getName());
    }
}
