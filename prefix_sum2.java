import java.util.Scanner;
public class prefix_sum2 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int n1=obj.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[n1];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int u=obj.nextInt();
        int v=obj.nextInt();
        int count=0,count1=0;
        for(int i=u-1;i<n;i++){
            count=count+arr[i];
            if(count==v){
                System.out.println(i+1);
                break;
            }
        }

        for(int i=0;i<n1;i++){
            arr[i]=obj.nextInt();
        }
        int u1=obj.nextInt();
        int v1=obj.nextInt();

        for(int i=u1-1;i<n1;i++){
            count1=count1+arr[i];
            if(count1==v1){
                System.out.println(i+1);
                break;
            }
        }

    }
}
