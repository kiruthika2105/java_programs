import java.util.Scanner;
public class palin {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n = obj.nextInt();
        int[] a=new int[n];
        int[] arr = new int[n];
        int k=0;
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]) a[i]=arr[j];
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
