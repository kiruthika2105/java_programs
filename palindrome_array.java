import java.util.Scanner;
public class palindrome_array {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]) count++;

            }
            if(i==n-1) {
                count = 0;
                System.out.println(i+1+": "+count);
            }
            else  {
//                count=count-1;
                System.out.println(i+1+": "+(count)+1);
            }
        }
    }
}



