package cb.algo.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathDiagRec {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Maze of 3x3
        // starting from 0,0 reach till 2,2
        ArrayList<String> ans = mazePath(0,0,2,2);
        System.out.println(ans);
    }

    private static ArrayList<String> mazePath(int sr, int sc, int er, int ec) {

        if(sr ==er && sc==ec){
            ArrayList<String> baseList = new ArrayList<>();
            baseList.add("");
            return baseList;
        }
        if(sr>er || sc>ec){
            ArrayList<String> baseList = new ArrayList<>();
            return baseList;
        }
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> rrh = mazePath(sr,sc+1,er,ec);
        for(String rrhs:rrh){
            ans.add("H"+rrhs);
        }
        ArrayList<String> rrv = mazePath(sr+1,sc,er,ec);
        for(String rrvs:rrv){
            ans.add("V"+rrvs);
        }

        ArrayList<String> rrd = mazePath(sr+1,sc+1,er,ec);
        for(String rrds:rrd){
            ans.add("D"+rrds);
        }
        return ans;


    }
}

