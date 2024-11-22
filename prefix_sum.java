import java.util.Scanner;
public class prefix_sum {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++){
            int n1=obj.nextInt();
            int[] arr=new int[n1];

            for(int j=0;j<n1;j++) {

                arr[j] = obj.nextInt();
            }

                int n2=obj.nextInt();
                for(int l=0;l<n2;l++){
                    int count=0;
                    int a=obj.nextInt();
                    int b=obj.nextInt();
                    for(int m=a-1;m<b;m++) {
                        count=count+arr[m];
                    }
                    System.out.println(count);
                }
            }
        }
    }

