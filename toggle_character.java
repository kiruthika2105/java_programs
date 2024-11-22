import java.util.Scanner;

public class toggle_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                c = (char) (c + 32);
                s1 += c;
            } else if (c >= 97 && c <= 122) {
                c = (char) (c - 32);
                s1 += c;
            }
        }
        System.out.println(s1);

    }
}
