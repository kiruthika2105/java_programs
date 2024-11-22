import java.util.Scanner;
public class sub {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++){
            int a=obj.nextInt();
            int b=obj.nextInt();
           while(a!=b){
               if(a>b) a=a-b;
               if(b>a) b=b-a;
           }
            System.out.println(a+b);
        }
    }
}
