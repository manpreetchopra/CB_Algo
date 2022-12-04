package cb.algo.recursion.print;

import java.util.Scanner;

public class _3_PermutationsRecPrint {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter String :");
        String ques = sc.next();
        System.out.println("Permutations are : ");
        printPS(ques,"");
    }

    private static void printPS(String ques, String res) {

        if(ques.length() == 0){
            System.out.print(res+",");
            return;
        }
        for(int i =0; i<ques.length();i++){
            char ans = ques.charAt(i);
            String roq = ques.substring(0,i)+ques.substring(i+1);
            printPS(roq,res+ans);
        }
    }
}

