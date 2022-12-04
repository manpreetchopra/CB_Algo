package cb.algo.recursion.print;

public class _5_MazePathRecPrint {
    public static void main(String[] args) {
        printMazePath(0,0,2,2,"");
    }

    private static void printMazePath(int cr, int cc, int er, int ec, String res) {

        if(cr == er && cc == ec){
            System.out.println(res);
            return;
        }
        if(cr> er || cc>ec){
            return;
        }
        printMazePath(cr, cc+1, er, ec, res+"H");
        printMazePath(cr+1, cc, er, ec, res+"V");
    }
}
