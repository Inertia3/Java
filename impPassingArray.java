public class impPassingArray {
    // static void change(int a){
    //     a=98;
    // }
    // public static void main(String[] args){
    //     int x=45;
    //     change(x);
    //     System.out.println("The value of x is not changed if we change anything in change method:"+x);
    // }
    //but in case of arrays it changes because array stores the adress of index 0 of a memory block allocated inside the memory
    static void change(int []arr){   //arr is just the referenc to the memory address
        arr[0]=98;
    }
    public static void main(String[] args){ 
        int [] marks={56,67,99,98,87};
        change(marks);
        System.out.println("The value of marks[0] after the change is:"+marks[0]); //and yes it is changed
    }
}
//this thing can happen in case of integer as well but we have to pass reference of that integer

 
