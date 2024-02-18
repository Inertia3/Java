public class customClass {
    public static void main(String[] args) {       //There can be only one public custom class in java prigram file
        System.out.println("This is a custom class in java");
        Employee sahil = new Employee();    //Instantiating a new employee object
        // Settting up attributes and properties
        sahil.name="Sahil Ansari";
        sahil.id=13150;
        //System.out.println("Details of the employee-\n"+"Name-"+sahil.name+"\nId-"+sahil.id);
        sahil.show(); 
    }   
}
class Employee{
    String name;   //Attributes
    int id;
    public void show(){
        System.out.println("Details of the employee-\n"+"Name-"+name+"\nId-"+id);
    }
}
