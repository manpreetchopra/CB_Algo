package cb.algo.recursion.print;

public class _4_BoardPathRecPrint {
    public static void main(String[] args) {
        prinBoardPath(0,10,"");
    }

    private static void prinBoardPath(int curr, int end, String ans) {

        if(curr == end){
            System.out.print(ans+",");
            return;
        }

        if(curr > end){
            return;
        }

        for(int dice = 1; dice <=6; dice++){
            prinBoardPath(curr+dice,end, ans+dice);
        }
    }
}
