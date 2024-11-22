import java.util.Scanner;
public class halfpyramid_pattern {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String s="";
        String s1="";
        String s2="";
        String s3="*";
        String space=" ";
        String s4="";
         int j=n-3;
        for(int i=1;i<=n;i++){
            if(i<n-1) {
                s = s + " ";
            }
            if(i<n) {
                s4 = s4 + "*";
            }
            s1=s1+"*";
            if(i==n) s2=s2+"*";
            else s2=s2+" ";
        }
        System.out.println(s2);
        for(int i=0;i<n-2;i++){
            System.out.println(s+s3+space+s3);
            space=space+"  ";
            s=s.substring(0,j);
            j--;

        }
        System.out.println(s1+s4);
    }
}
