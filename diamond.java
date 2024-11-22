import java.util.Scanner;
public class diamond {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String s="";
        String s1="*";
        for(int i=0;i<n;i++){
            s=s+"*";
        }
        for(int i=0;i<n-1;i++){
            System.out.println(s1);
            s1=s1+"*";
        }
        System.out.println(s);
        for(int i=n-1;i>=0;i--){
            System.out.println(s1.substring(0,i));
        }
    }
}
