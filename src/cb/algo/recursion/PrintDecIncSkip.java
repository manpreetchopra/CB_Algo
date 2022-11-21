package cb.algo.recursion;

import java.util.Scanner;

public class PrintDecIncSkip {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //5,3,1,2,4
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        pdiSkip(n);
    }

    private static void pdiSkip(int n) {

        if(n ==0 ){
            return;
        }
        if(n%2 == 1){
            System.out.println(n);
        }
        pdiSkip(n-1);
        if(n%2 ==0){
            System.out.println(n);
        }
    }
}
