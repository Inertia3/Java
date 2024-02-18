
class threading1 extends Thread{
    public void run(){
        try{
        // Thread.sleep(5000);
        int i = 1;
        while(i<=10){
             System.out.println(2*i);
             i++;
        }
    }
    catch(Exception e){
    System.out.println(e);
}
}
}

public class tableThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        threading1 t1 = new threading1();
        t1.start();
    }
}
