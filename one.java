import java.util.Scanner;
public class one {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=n+7;
        if(k>170){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
