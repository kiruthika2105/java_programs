import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        String s=" ";
        String s1=" ";
        for(int i=1;i<=n;i++){
            s=s+"*";
            if(i==1|| i==2) {
                s1 = s1 + "*";
            }
        }
        System.out.println("*");
        System.out.println(s1);
        for(int i=0;i<n-2;i++){
            s1=s1.charAt(i)+" ";
            System.out.println(s1);
        }
        System.out.println(s);
//        int n = obj.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if(j==1|| i==n || i==j){
//                    System.out.print("*");
//                }
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }

    }
}
