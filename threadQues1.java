// Write aa program to print good morning and 
// welcome continously on the screen in java using 
// Threads
class ques1 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Good Morning");
            i++;
        }
    }
}
class ques11 extends Thread{
    public void run(){
        int j = 0;
    while(j<100){
        System.out.println("Welcome");
        j++;
    }
    }
} 
public class threadQues1 {
    public static void main(String[] args) {
        ques1 q1 = new ques1();
        ques11 q2 = new ques11();
        q1.start();
        q2.start();
    }
}
