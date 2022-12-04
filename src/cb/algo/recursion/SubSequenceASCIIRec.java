package cb.algo.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubSequenceASCIIRec {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter n :");
       String str = sc.next();
       ArrayList ans = getSSAscii(str);
        System.out.println(ans);
    }

    private static ArrayList getSSAscii(String str) {

        if(str.length() == 0){
            ArrayList<String>  baseList = new ArrayList<>();
            baseList.add(" ");
            return baseList;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> myList = new ArrayList<>();
        ArrayList<String> recList = getSSAscii(ros);

        for(int i =0; i<recList.size(); i++){
            myList.add(recList.get(i));
            myList.add(cc+recList.get(i));
            myList.add((int) cc+recList.get(i));
        }
        return myList;
    }
}

