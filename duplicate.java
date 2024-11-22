import java.util.*;
import java.util.Scanner;
public class duplicate {
    public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
     for(int i=0;i<n;i++){
         int a=obj.nextInt();
         int ans=(int)Math.sqrt(a);
         System.out.println(ans);
     }
    }
}
