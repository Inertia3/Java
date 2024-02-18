public class blocksInJava {
    public static void main(String[] args){
        employee emp = new employee();
        emp.show();
    }
    
}
//static block  instantition block   constructor block
class employee{
    void show(){
        System.out.println("Order of execution of different blocks in java");
    }
    employee(){
        System.out.println("Constructor Block");
    }
    {
        System.out.println("Instantiation Block");
    }
    static{
        System.out.println("Static Block");
    }
}

//Execution sequence of different blocks 
//static is executed first
//and then Instantiation 
//and the the constructor block, though the constructor is initialized first but it is executed last