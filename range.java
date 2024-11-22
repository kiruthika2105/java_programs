import java.util.Scanner;
public class range {
    public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int l=obj.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=obj.nextInt();
      }
      for(int i=0;i<l;i++){
          int count=0;
          int a=obj.nextInt();
          int b=obj.nextInt();
          for(int j=a-1;j<b;j++){
              count=count+arr[j];
          }
          System.out.println(count);
      }
    }
}
