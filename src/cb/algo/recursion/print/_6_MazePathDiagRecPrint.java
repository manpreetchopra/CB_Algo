package cb.algo.recursion.print;

public class _6_MazePathDiagRecPrint {
    public static void main(String[] args) {
        printMazeDiag(0,0,2,2,"");
    }

    private static void printMazeDiag(int cr, int cc, int er, int ec, String res) {

        if(cr == er && cc == ec){
            System.out.println(res);
            return;
        }

        if(cr>er || cc> ec){
            return;
        }

        printMazeDiag(cr, cc+1, er, ec, res+"H");
        printMazeDiag(cr+1, cc, er, ec, res+"V");
        printMazeDiag(cr+1, cc+1, er, ec, res+"D");
    }
}
