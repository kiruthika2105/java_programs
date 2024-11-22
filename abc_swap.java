import java.util.Scanner;
public class abc_swap {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int y=obj.nextInt();
        if(x==y) System.out.println("Yes");
        if(x>y) System.out.println("No");
    }
}
