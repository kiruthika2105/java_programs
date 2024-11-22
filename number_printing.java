import java.util.Scanner;
import java.util.ArrayList;
public class number_printing {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        int n = obj.nextInt();

        for (int i = 0; i < n; i++) {

            ar.add(obj.nextInt());

        }
        int k = obj.nextInt();
        ar.add(k);
        int i = 0;
        while (i < ar.size()) {
            System.out.print(ar.get(i)+" ");
            i++;
        }

    }

}
