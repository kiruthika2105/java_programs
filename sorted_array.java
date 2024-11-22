import java.util.Scanner;

public class sorted_array {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int count=0;
      for(int i=0;i<n-1;i++){
         if(arr[i]>arr[i+1]){
             count=1;
          System.out.print("false");
          break;
        }
      }
      if(count==0)  System.out.print("true");
    }
}
