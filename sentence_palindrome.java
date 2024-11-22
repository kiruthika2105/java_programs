import java.util.Scanner;
import java.util.*;
public class sentence_palindrome {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        StringBuilder a=new StringBuilder();
        StringBuilder b=new StringBuilder();

        System.out.println(s);
        for(int i=0;i<s.length();i++){
            if(((s.charAt(i)>=65)&& (s.charAt(i)<=90)) || ((s.charAt(i)>=97)&& (s.charAt(i)<=122))){

                a.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        b.append(a);
         a.reverse();

        System.out.println(b);
        System.out.println(a);
        if(a.compareTo(b) == 0) System.out.println("true");
        else System.out.println("False");
    }
}
