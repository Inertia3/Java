class Student{
    private String name;
    private long uid;

    void setName(String s, long u){
        this.name  = s;
        this.uid  = u;
    }
    public Student getName(){
        return this;
    }
    void show(){
        System.out.println("Name of Student = "+name);
        System.out.println("Uid of student = "+uid);
    }
} 
public class exp141 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Sahil Ansari", 13150);
        Student s1 = new Student();
        s1 = s.getName();
        s1.show();
    }
}
