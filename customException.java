import java.util.Scanner;

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "NegativeDimensionException";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative";
    }
    @Override
    public void printStackTrace(){
        System.out.println("Exception Occured at line 21");
    }

    public static double areaCircle(double r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double area = Math.PI*r*r;
        return area;
    }
}
public class customException extends NegativeRadiusException{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle = ");
        double r = sc.nextDouble();
            try{
                double result = areaCircle(r);
                System.out.println("Area of circle = "+result);
            }
            catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        
    }
