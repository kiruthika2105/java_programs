import java.util.Scanner;

public class right_angle_triangle_patternn {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(k+" ");
                k++;

            }
            System.out.println();
        }
    }
}
