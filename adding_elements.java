import java.util.Scanner;
public class adding_elements {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long n=obj.nextLong();
        long[] arr=new long[(int)n];
        for(long i=0;i<n;i++){
            arr[(int)i]=obj.nextInt();
        }
        long max=arr[0];
        long index=0;
        for(long i=1;i<n;i++){
            if(arr[(int)i]<max){
                max=arr[(int) i];
                index=i;
            }
        }
       System.out.println(index);
    }
}
