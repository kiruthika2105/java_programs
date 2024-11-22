import java.util.Scanner;
public class array_rotation {
    public static void main(String[] args){
        Scanner obj=new Scanner (System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int k=obj.nextInt();
        k=k%n;
            for (int j = 0; j < k; j++) {
                int temp = arr[0];
                for (int i = 0; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[n - 1] = temp;

            }

        for (int l = 0; l< n; l++) System.out.print(arr[l] + " ");
    }
}
