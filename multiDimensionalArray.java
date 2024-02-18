import java.util.Scanner;
public class multiDimensionalArray {
    public static void main(String[] args){
        //A 2-D array
        int [][]flat =new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of 2-D array:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                flat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements of the arrays are:");
        for(int i=0;i<flat.length;i++){
            for(int j=0;j<flat.length;j++){
                System.out.print(flat[i][j]+"\t");
            }
            System.out.println();
        }
        //we can also print multi dimensionL ARRAY using for each loop
        // for(int []element:flat){
        //     for(int element:flat){

        //     }
        //     System.out.println(element+" ");
        // }
        sc.close();
    }

    
}
