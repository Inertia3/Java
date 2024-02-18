
class ArithematicSum{
    int a, b;
    int sum =0;
    void setInfo(int x, int y){
        a=x;
        b=y;
    }
    int calcSum(){
        sum = a+b;
        return sum;
    }
    void display(){
        int s = calcSum();
        System.out.println("Sum of "+a+" and "+b+" is :- "+s);
    }
}
public class exp2 {
    public static void main(String args[]){
        ArithematicSum as = new ArithematicSum();
        as.setInfo(4,5);
        as.calcSum();
        as.display();
    }
}
