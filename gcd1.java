import java.util.Scanner;

public class gcd1 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int n1=obj.nextInt();
        System.out.println(gcd(n,n1));


    }
    public static int gcd(int n,int n1){
        if(n1==0) return n;
        return gcd(n1,n%n1);

    }
}
