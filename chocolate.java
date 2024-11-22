import java.util.Scanner;
import java.util.*;
public class chocolate {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++){
            int a=obj.nextInt();
            int b=obj.nextInt();
           if(a!=b){
               System.out.println(sub(a,b));
           }
           if(a==b) System.out.println(a+b);
        }
    }
    private static int sub(int a, int b) {
        if(a==b) return a+b;
        if(a>b) a=a-b;
        if(b>a) b=b-a;
        return sub(a,b);
    }
}
