import java.util.Scanner;
public class pt2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1|| i==n || i==j){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}


//import java.util.Scanner;
//public class pt2 {
//    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//        int n = obj.nextInt();
//        int j=n-1;
//        for(int i=0;i<n && ;i++){
//                if(i==0 || i==n-1){
//                    System.out.print("*");
//                }
//                else System.out.print(" ");
//            }
//            System.out.println();
//
//    }
//}