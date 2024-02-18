class threading1 extends Thread{
    public void run(){
        try{
        Thread.sleep(5000);
        int i = 0;
        while(i<10){
             System.out.println("Thread One Running");
             System.out.println("Studying");
             i++;
        }
    }
    catch(Exception e){
    System.out.println(e);
}
}
}
class threading2 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
             System.out.println("Thread Two Running");
             System.out.println("Chatting with her");
             i++;
        }
    }
}
public class multithreadingInJava {
    public static void main(String[] args) {
        threading1 t1 = new threading1();
        threading2 t2 = new threading2();
        t1.start();
        t2.start();
    }
}
