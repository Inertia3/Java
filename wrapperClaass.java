public class wrapperClaass {
    public static void main(String args[]){
        Integer i = new Integer(10);
        System.out.println("i="+i);  // boxing or wrapping
        int j = i.intValue(); // unrapping // unboxing
        System.out.println("j="+j);
    }
}
