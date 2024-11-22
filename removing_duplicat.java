import java.util.Scanner;
import java.util.*;
public class removing_duplicat {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
//        int[] a=new int[n];
        HashSet <Integer> a = new HashSet<>();
//       int k=obj.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i]=obj.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a.add(arr[i]);
        }

        for(int v:a) System.out.println(v);
//        for(int i=0;i<n;i++) {
//           for(int j=i+1;j<n;j++){
//               if(arr[i]==arr[j])a[i]=arr[j];
//               else a[i]=arr[j];
//           }
//        }
//        for(int i=0;i<n;i++)System.out.println(a[i]);
    }

}
