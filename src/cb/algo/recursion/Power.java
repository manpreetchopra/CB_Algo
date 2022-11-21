package cb.algo.recursion;

import java.util.Scanner;

public class Power {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number :");
        int n = sc.nextInt();
        System.out.println("Enter power :");
        int p = sc.nextInt();
        int ans = power(n,p);

        System.out.println(ans);
    }

    private static int power(int n, int p) {

        if(p == 0){
            return 1;
        }
        int pownm1 = power(n,p-1);
        int pown = n*pownm1;
        return pown;
    }
}

