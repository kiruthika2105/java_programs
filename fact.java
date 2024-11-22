import java.util.Scanner;
import java.util.*;

public class fact {
        public static void main(String[] args){
            Scanner obj=new Scanner(System.in);
            int n=obj.nextInt();
            for(int i=0;i<n;i++){
                int a=obj.nextInt();
                int count=0;
                int[] arr=new int[a];
                for(int j=0;j<a;j++){
                    arr[j]=obj.nextInt();
                }
                for(int k=0;k<a;k++){
                    if(arr[k]<0) count++;
                }
                Arrays.sort(arr);
                if(count%2==0) System.out.println("1");
                else System.out.println("0");
            }
        }
    }


