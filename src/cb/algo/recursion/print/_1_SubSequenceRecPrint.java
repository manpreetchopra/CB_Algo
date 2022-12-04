package cb.algo.recursion.print;

import java.util.Scanner;

public class _1_SubSequenceRecPrint {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        String str = sc.next();
        System.out.println("Subsequences are : ");
        printSS(str,"");
    }

    private static void printSS(String str, String res) {

        if(str.length() ==0){
            System.out.print(res+",");
            return;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        printSS(ros, res);
        printSS(ros, res+cc);
    }

}
