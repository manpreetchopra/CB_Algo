package cb.algo.recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class
GetBoardPathRec {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Return all ways to reach from 0 to 10 by roll of dice(1-6)
        ArrayList ans = getBoardPath(0, 10);
        System.out.println(ans.size());
        System.out.println(ans);

    }

    private static ArrayList<String> getBoardPath(int cur, int end) {

        if(cur == end){
            ArrayList<String> baseList = new ArrayList<>();
            baseList.add("");
            return baseList;
        }

        if(cur > end){
            ArrayList<String> baseList = new ArrayList<>();
            return baseList;
        }

        ArrayList<String> mr = new ArrayList<>();
        for(int dice = 1; dice<=6; dice++){
            ArrayList<String> rr =getBoardPath(cur+dice, end);
            for(String r :rr){
                mr.add(dice+r);
            }
        }
        return mr;
    }
}

