import java.util.Scanner;
public class reverse_string {
    public static void main (String[] args){
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String[] c=s.split(" ");
        int i=0;
        String s2="";
        int j=c.length-1;
        while(i<j){
            String temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<c.length;k++){
            s2=s2+(c[k]+" ");
            System.out.println(s2);
        }
    }
}
