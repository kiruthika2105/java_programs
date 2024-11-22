import java.util.Scanner;
import java.util.*;
public class maximum_element {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
            int n=obj.nextInt();
            int[] arr=new int[n];
//            ArrayList<Integer> ar=new ArrayList<>();
            int count=0,k=0;
            int count1=0;
            for(int i=0;i<n;i++){
                arr[i]=obj.nextInt();
//                count=arr[0];
//                if(count<arr[i]) {
//                    count=arr[i];
//                    k=arr[count1];
//                    count1++;
//                }
            }
            Arrays.sort(arr);
            for(int i=n-1;i>0;i--){
                if(arr[i]>arr[i-1]) {
                    System.out.println(arr[i-1]);
                    break;
                }
            }
//            System.out.println(count);
//        System.out.println(count1);
//        System.out.println(arr[k]);
    }
}
