import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                count=1;
                System.out.println(i);
                break;
            }
        }
        if(count==0) System.out.println(-1);
    }
}
