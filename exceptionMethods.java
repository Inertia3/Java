public class exceptionMethods {

    public static int  divide(){
        int a = 8;
        int b = 0;
        int c = a/b;
        return c;
    }
    public static void main(String[] args){
        try{
            int d = divide();
            System.out.println(d);
        }
        // catch(Exception e){
        //     System.out.println(e);
        //     System.out.println(e.toString());  /// prints only exception name and description of the exception
        // java.lang.ArithmeticException: / by zero
        // java.lang.ArithmeticException: / by zero
        // }
        // catch(Exception e1){
        //     System.out.println(e1.getMessage());  // prints only description of the exception
        //     // / by zero
        // }
        catch(Exception e2){
            e2.printStackTrace();  // prints everything Exception name, Description and line where exception occured
            // java.lang.ArithmeticException: / by zero
            // at exceptionMethods.divide(exceptionMethods.java:6)
            // at exceptionMethods.main(exceptionMethods.java:11)
        }

    }
}
