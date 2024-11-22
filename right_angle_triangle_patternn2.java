import java.util.Scanner;

public class right_angle_triangle_patternn2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=1;i<=n;i++) {
            int k=n-1;
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i);

            }
            System.out.println();
        }
    }
}
