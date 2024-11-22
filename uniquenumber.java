import java.util.Scanner;

public class uniquenumber {
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            int n = obj.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
            }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]) {
                        arr[i] = -1;
                        arr[j]=-1;
//                        System.out.println(arr[i]);
                    }

                }
            }
            for(int i=0;i<n;i++) {
                if(arr[i]!=-1) {
                    System.out.println(arr[i]);
                }
            }
        }
}
