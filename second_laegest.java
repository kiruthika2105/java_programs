import java.util.Scanner;

public class second_laegest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            count=arr[0];
            arr[i]=obj.nextInt();
            if(arr[i]>count){
                count=arr[i];
            }
        }
//        System.out.println(count);
        int slarge=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>slarge && arr[i]<count) slarge=arr[i];
        }
        System.out.println(slarge);
    }
}
