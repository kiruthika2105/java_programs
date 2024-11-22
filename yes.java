import java.util.Scanner;
public class yes {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++){
            String s=obj.next();
            s=s.toLowerCase();
            if(s.equals("yes")) System.out.println("YES");
            else System.out.println("No");
        }
    }
}
