import java.util.Scanner;

public class fibonaccirecursion {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println(fib(n));
    }

    private static int fib(int n) {
        if(n==1 || n==0) return n;
        return fib(n-1)+fib(n-2);
    }

}
