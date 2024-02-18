// Add a sleep method in question and de
// delay its execution for 200 ms
class ques1 extends Thread{
    public void run(){
        int i = 0;
        while(i<1000){
            System.out.println("Good Morning");
            i++;
        }
    }
}
class ques11 extends Thread{
    public void run(){
        int j = 0;
    while(j<1000){
        System.out.println("Welcome");
        j++;
    }
    }
} 
public class threadQues2 {
    public static void main(String[] args) {
        ques1 q1 = new ques1();
        ques11 q2 = new ques11();
        try{
            q1.start();
            Thread.sleep(200);
        }
        catch(Exception e){
            System.out.println(e);
        }
        q2.start();
    }
}
