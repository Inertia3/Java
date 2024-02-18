// // class Table{
// //     synchronized void printTable(int n){
// //         for(int i = 1; i<=10; i++){
// //             System.out.print(" "+n*i);
// //         }
// //         System.out.println();
// //     }
// // }

// // class MyThread1 extends Thread{
// //     Table t = new Table();
// //     MyThread1(Table t){
// //         this.t = t;
// //     }

// //     public void run(){
// //         t.printTable(5);
// //     }
// // }

// // class MyThread2 extends Thread{
// //     Table t = new Table();
// //     MyThread2(Table t){
// //         this.t = t;
// //     }

// //     public void run(){
// //         t.printTable(10);
// //     }
// // }
// // public class threadSynch {
// //     public static void main(String[] args) {
// //         Table t1 = new Table();
// //         MyThread1 m1 = new MyThread1(t1);
// //         MyThread2 m2 = new MyThread2(t1);
// //         m1.start();
// //         m2.start();
// //     }
// // }


// // synchronized block
// class Table{
//     void printTable(int n){
//         synchronized(this){
//         for(int i = 1; i<=10; i++){
//             System.out.print(" "+n*i);
//         }
//         System.out.println();
//     }
// }
// }

// static synchronization

// class MyThread1 extends Thread{
//     Table t = new Table();
//     MyThread1(Table t){
//         this.t = t;
//     }

//     public void run(){
//         t.printTable(5);
//     }
// }

// class MyThread2 extends Thread{
//     Table t = new Table();
//     MyThread2(Table t){
//         this.t = t;
//     }

//     public void run(){
//         t.printTable(10);
//     }
// }
// public class threadSynch {
//     public static void main(String[] args) {
//         Table t1 = new Table();
//         MyThread1 m1 = new MyThread1(t1);
//         MyThread2 m2 = new MyThread2(t1);
//         m1.start();
//         m2.start();
//     }
// }


// static synchronization

class Table{
    synchronized static void printTable(int n){
        for(int i = 1; i<=10; i++){
            System.out.print(" "+n*i);
        }
        System.out.println();
    }
}

class MyThread1 extends Thread{
    Table t = new Table();
    MyThread1(Table t){
        this.t = t;
    }

    public void run(){
        t.printTable(5);
    }
}

class MyThread2 extends Thread{
    Table t = new Table();
    MyThread2(Table t){
        this.t = t;
    }

    public void run(){
        t.printTable(10);
    }
}
public class threadSynch {
    public static void main(String[] args) {
        Table t1 = new Table();
        MyThread1 m1 = new MyThread1(t1);
        MyThread2 m2 = new MyThread2(t1);
        m1.start();
        m2.start();
    }
}
