import java.util.Scanner;

public class patern3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        String s="";
        String s1="";
        String s3=" ";
        String s2=" ";
        for(int i=0;i<n;i++){
            s=s+"*";
            s2=s2+" ";
            if(i==n-1)s3=s3+"*";
            else s3=s3+" ";
            if(i==n-1 || i==n-2) s1=s1+"*";
            else s1=s1+" ";
        }
        System.out.println(s3);
        System.out.println(s1);
//        for(int i=0;i<n;i++){
//            s1=s1.charAt(i)+" ";
//            System.out.println(s1);
//
//        }
        System.out.println(s);
    }
}
