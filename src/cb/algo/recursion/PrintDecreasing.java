package cb.algo.recursion;

import java.util.Scanner;

public class PrintDecreasing {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //5,4,3,2,1
        System.out.println("Enter value to print decreasing : ");
        int n = sc.nextInt();
        printDecreasing(n);
    }

    private static void printDecreasing(int n) {

        if(n==0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}
