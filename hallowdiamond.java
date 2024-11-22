import java.util.Scanner;
public class hallowdiamond {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String s="";
        String s1="";
        String s2="";
        String space=" ";
        String st="";
        int j=n-3;
        for(int i=1;i<=n;i++){
            if(i<n-1) {
                s = s + " ";
            }

            if(i==1)st=st+"*";
            if(i==1 || i==n)s1=s1+"*";
            else s1=s1+" ";
            if(i==n) s2=s2+"*";
            else s2=s2+" ";
        }
        String s5=" ";
        System.out.println(s2);
        for(int i=0;i<n-2;i++){
            System.out.println(s+"*"+space+"*");
            space=space+"  ";
            s=s.substring(0,j);
            j--;
        }
//        System.out.println(st);

//        for (int i = 0; i < n - 2; i++) {
//                space = space.substring(i, space.length() - 1);
//            System.out.println(s5 + "*" + space + "*");
//            s5 = s5 + " ";
//        }
//        System.out.println(s2);
    }
}
