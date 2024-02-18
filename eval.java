class threading1 extends Thread{
    public void run(){
        for(int i = 1; i<20; i=i+2){
            // int j = i-1;
            System.out.println("even = "+i);
            // System.out.println("odd = "+i);
        }
    }
}


class threading2 extends Thread{
    public void run(){
       for(int i = 1; i<20; i=i+2){
            System.out.println(i);
        }
    }
}
public class eval {
    public static void main(String[] args) {
        threading1 t1 = new threading1();
        threading2 t2 = new threading2();
        t1.start();
        t2.start();
    }
}
