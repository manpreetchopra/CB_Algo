package cb.algo.recursion;

import java.util.Scanner;

public class Factorial {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number  : ");
        int n = sc.nextInt();
        int fact = fact(n);
        System.out.println("Factorial of "+n+" is :"+fact);

    }

    private static int fact(int n) {
        if(n==1){
            return 1;
        }

        int fnm1 = fact(n-1);
        int fn = n*fnm1;
        return fn;
    }
}
