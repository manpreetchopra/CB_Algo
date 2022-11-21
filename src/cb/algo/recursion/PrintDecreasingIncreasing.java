package cb.algo.recursion;

import java.util.Scanner;

public class PrintDecreasingIncreasing {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //5,4,3,2,1,1,2,3,4,5
        System.out.println("Enter n  : ");
        int n = sc.nextInt();
        pdi(n);
    }

    private static void pdi(int n) {

        if(n==0){
            return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
