import java.util.Scanner;

public class size_of_tshirt {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i = 0; i < n; i++) {
            int n1 = obj.nextInt();
            int count = 0, count1 = 0;

            for(int j = 0; j < n1; j++) {
                String s = obj.next();
                s = s.toLowerCase();

                if(!s.equals("m") && !s.equals("e") && !s.equals("o") && !s.equals("w")) {
                    count1++;
                } else {
                    count++;
                }
            }

            if(count == n1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        obj.close();  // Close the scanner
    }
}
