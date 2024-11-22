import java.util.Scanner;
public class rule107 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++){
            int x=obj.nextInt();
            int y=obj.nextInt();
            double k= (double) (x * 107) /100;
            if(k<y) System.out.println("No");
            else System.out.println("YES");

        }
    }
}
