class prime{
    public void primeNumber(int n){
        int[] arr = new int[100];
        int k = 0;
        for(int i = 1; i<100; i++){
            int count = 0;
            for(int j = 1; j<100; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count<=2){
                arr[k] = i;
                k++;
            }
        }
        System.out.println(arr[n]);
    }
}

public class nthPrime{
    public static void main(String[] args) {
        prime p = new prime();
            p.primeNumber(4);
    }
}
