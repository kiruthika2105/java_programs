import java.util.Scanner;
public class stringreverse {
    public static void main (String[] args){
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        char[] c=s.toCharArray();
        int i=0;
        int j=c.length-1;
        while(i<j){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        s="";
        for(int k=0;k<c.length;k++){
           s=s+c[k];
        }
        System.out.println(s);
    }
}