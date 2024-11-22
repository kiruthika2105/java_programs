import java.util.Scanner;
public class pretty_number {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++){
            int a=obj.nextInt();
            int b=obj.nextInt();
            int count=0;
            for(int j=a;j<=b;j++){
                if(j%10==2 || j%10==3 || j%10==9){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
