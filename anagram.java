import java.util.Scanner;
public class anagram {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String s1=obj.nextLine();
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            arr[c-97]=arr[c-97]+1;
        }
        for(int i=0;i<s1.length();i++){
            char c=s.charAt(i);
            arr[c-97]=arr[c-97]-1;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(arr[i]!=0)count++;
        }
        if(count==0) System.out.println("true");
        else System.out.println("false");

    }

}
