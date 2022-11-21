package cb.algo.recursion;

import java.util.Scanner;

public class PrintIncreasing {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //1,2,3,4,5
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        printIncreasing(n);
    }

    private static void printIncreasing(int n) {

        if(n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}
