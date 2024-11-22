import java.util.Scanner;
public class lestshift {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int n1=obj.nextInt();
        int count=0;
        boolean flag=true;
        while (n!=0){
            if(n1==count && (n&1)==1){
                flag=false;
                System.out.println("true");
                break;
            }
            n=n>>1;
            count++;
        }
        if(flag) System.out.println("false");
    }
}
