import java.util.Scanner;
import java.util.Arrays;
public class next {
    public static int fibonacci(int n){
        int[] arr=new int[n+1];
        Arrays.fill(arr,-1);
        if(n==0 || n==1) return n;
        if(arr[n]!=-1) return arr[n];
        arr[n]=fibonacci(n-1)+fibonacci(n-2);
        return arr[n];
    }
    public static void main(String[] args){
       Scanner obj=new Scanner(System.in);
       int n=obj.nextInt();
       System.out.println(fibonacci(n));
    }
}
