package cb.algo.recursion;

import java.util.Scanner;

public class PatternPrintRec {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Print
//        *
//        **
//        ***
//        ****
//        *****
        System.out.println("Enter n :");
        int n = sc.nextInt();
        printPattern(n,1,1);
    }

    private static void printPattern(int n, int row, int col) {

        if(row>n){
            return;
        }
        if(col>row){
            System.out.println();
            printPattern(n,row+1,1);
            return;
        }
        System.out.print("*");
        printPattern(n,row,col+1);
    }
}

