import java.util.Scanner;
public class arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int []marks =new int[5];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<5; i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("Elements of the array are:");
    //     for(int i=0;i<marks.length;i++){
    //         System.out.print("\t"+marks[i]);
    //     }
    //     sc.close();
    // }
    //printing arrays can be also done using for each loop
    for(int element:marks){
        System.out.print(element+" ");
    }
    sc.close();
}
}
