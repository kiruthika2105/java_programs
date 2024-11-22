import java.util.Scanner;
public class sumofoddnumbers {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0) count=count+arr[i];
        }
        System.out.println(count);
    }
}
