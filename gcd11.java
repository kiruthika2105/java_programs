import java.util.Scanner;
public class gcd11 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++){
            int b=obj.nextInt();
            int a=b;
            int count=0;
            while(a!=0){
                int div=a%10;
                count=(count*10)+div;
                a=a/10;
            }
            a=count;
            System.out.println(count);
        }
    }
}
