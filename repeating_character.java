import java.util.Scanner;
public class repeating_character {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=0;i<n;i++){
            String s=obj.next();
            int count=0;
            for(int j=0;j<s.length();j++){
                int k;
                for( k=j+1;k<s.length();k++){
                    if(s.charAt(j)==s.charAt(k)){
                        count=1;
                        System.out.println(s.charAt(k));
                        break;
                    }
                    if(count==1)break;
                }

            }
            if(count==0) System.out.println(".");
        }
    }
}
