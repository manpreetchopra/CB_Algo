package cb.algo.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationRec {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter String :");
        String str= sc.next();
        ArrayList<String> ans = permutations(str);
        System.out.println(ans);
    }

    private static ArrayList<String> permutations(String str) {

        if(str.length() == 0){
            ArrayList<String> baseList = new ArrayList<>();
            baseList.add("");
            return baseList;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> recList = permutations(ros);
        ArrayList<String> myList = new ArrayList<>();
        for(String recs : recList){
            for(int i =0; i<=recs.length(); i++){
                String perm = recs.substring(0,i)+cc+recs.substring(i);
                myList.add(perm);
            }
        }
        return myList;
    }
}

