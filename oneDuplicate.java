import java.util.Scanner;
public class oneDuplicate {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr= new int[n];
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]!=arr[j]){
                    a[i]=arr[j];
                }
            }
            System.out.println(a[i]);
        }

    }
}
