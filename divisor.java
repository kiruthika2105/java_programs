import java.util.Scanner;
public class divisor {
    public static void main (String[] args){
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int y=obj.nextInt();
        int n=obj.nextInt();
        int m=(n-y)/x;
        int k=(m*x)+y;
        System.out.println(k);
    }
}
