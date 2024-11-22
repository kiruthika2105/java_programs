import java.util.Scanner;
public class multiplication_of_array {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        for(int i=0;i<t;i++){
            int n=obj.nextInt();
            int count=1;
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=obj.nextInt();

            }
            for(int j=0;j<n;j++){

                count=count*arr[j];
            }

            System.out.println(count);

        }
    }
}

