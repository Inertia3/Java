public class exp12 {
    public static void main(String args[]){
        circle c = new circle(5.0);
        c.displayArea();
        circle c1 = new circle(7.7d);
        c1.displayArea();
        circle c2 = new circle(12.0d);
        c2.displayArea();


    }
}
class circle{
    double radius;

    circle(){
        this.radius = 1;
    }

    circle(double radius){
        this.radius = radius;
    }

    double calculateArea(){
        double area = (Math.PI * radius * radius);
        return area;
    }

    public void displayArea(){
        double a = calculateArea();
        System.out.printf("Area of circle with radius "+radius+" is - "+a);
        System.out.println();
    }
}
