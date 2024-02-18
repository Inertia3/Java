public class variableArgs {
    //variable arguments
    static int sum(int ...arr){
        //available as int [] arr;
        int result=0;
        // for(int element:arr){
        //     result=result+element;
        // }
        for(int i=0;i<arr.length;i++){     // proof that ..arr is available as int [] arr
            result=result+arr[0];
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Sum of nothing is:"+sum());
        System.out.println("The sum of 4 and 5 is:"+sum(4,5));
        System.out.println("The sum of 4,5 and 6 is:"+sum(4,5,6));
        System.out.println("The sum of 4,5,6,7 and 8 is:"+sum(4,5,6,7,8));
    }
}
