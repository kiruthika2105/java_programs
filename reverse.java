import java.util.Scanner;
import java.util.*;
public class reverse {
    public static void main (String[] args){
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        ArrayList<String> s1=new ArrayList<>();
        int i=0;
        int j=s.length()-1;
        String s2="";

        while(i<j) {
            if (s1.get(i) != " " && s1.get(j) != " ") {
                String temp = s1.get(i);
                s1.set(i, s1.get(j));
                s1.set(j, temp);
                i++;
                j--;
            }
        }
        for(int k=0;k<s1.size();k++){
            s2=s2+(s1.get(i)+" ");
            System.out.println(s2);
        }
    }
}
