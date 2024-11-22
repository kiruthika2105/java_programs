import java.util.Scanner;
public class prefix_sum1 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int q=obj.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr1[i]=arr[i-1]+arr[i];
        }
        arr1[0]=temp;
       
       for(int i=0;i<q;i++){
           int a=obj.nextInt();
           if(i%2==0){
               int b = 0;
               for(int j=0;j<a;j++){
                    b=obj.nextInt();
               }
               for(int k=0;k<n;k++){
                   if(arr1[k]==b){
                       System.out.println(k+1);
                       break;
                   }
               }
           }

           if(i%2!=0){
               int[] b=new int[a];
               for(int j=0;j<a;j++){
                   b[j]=obj.nextInt();
               }
               for(int k=0;k<a-1;k++){
                   arr[0]=b[k+1];
               }

           }

       }

    }
}
