package cb.algo.recursion;

import java.util.Scanner;

public class Fibbonacci {
    static Scanner sc =new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int fibn = fibn(n);
        System.out.println(fibn);
    }

    private static int fibn(int n) {

//        if(n==0){
//            return 0;
//        }
//        if(n==1){
//            return 1;
//        }
        if (n==0 || n==1){
            return n;
        }

        int fibnm1 = fibn(n-1);
        int fibnm2 = fibn(n-2);
        int fibn =  fibnm1+fibnm2 ;
        return  fibn;
    }
}
