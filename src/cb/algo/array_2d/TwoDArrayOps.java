package cb.algo.array_2d;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayOps {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        operations();
    }

    public static void operations() {
        int input = -1;
        int[][] arr = null;
        do {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("********************************************************");
            System.out.println("                2-D Array Operations : ");
            System.out.println(" Current Array : " + Arrays.deepToString(arr));
            System.out.println("********************************************************");
            System.out.println("0. Exit ");
            System.out.println("1. Use predefined array");
            System.out.println("2. Initialize a custom array");
            System.out.println("3. Display the Array");
            System.out.println("4. Print Wave Pattern (Row- wise)");
            System.out.println("5. Spiral Print");


            input = sc.nextInt();

            switch (input) {
                case 1:
                    arr = prepopulateArray();
                    System.out.println("Array Pre-populated with values : " + Arrays.deepToString(arr));
                    break;
                case 2:
                    arr = takeInput();
                    System.out.println("Array initialized wit values : " + Arrays.deepToString(arr));
                    break;
                case 3:
                    display(arr);
                    break;
                case 4:
                    printWavePatternRow(arr);
                case 5:
                    spiralPrint(arr);


            }
            if (input != 0) {
                System.out.println("Continue ? ");
                String c = sc.next();
                if (!"y".equalsIgnoreCase(c)) {
                    input = 0;
                }
            }
        } while (input != 0);
    }

    private static void spiralPrint(int[][] arr) {
        //ex array :
        // 11 12 13 14
        // 21 22 23 24
        // 31 32 33 34
        // 41 42 43 44

        //output : 11,12,13,14,24,34,44,43,42,41,31,21,22,23,33,32
        int top , bottom, left, right, count, dir;
        top = 0;
        bottom = arr.length-1;
        left = 0;
        right = arr[top].length-1;
        count = (bottom+1)*(right+1);
        dir = 1;

        while(top<=bottom && left<=right){
            if(count >0){
                if(dir ==1){
                    for(int i =left; i<=right; i++){
                        System.out.print(arr[top][i]+",");
                        count--;
                    }
                    top = top +1;
                    dir = 2;
                }
            }

            if(count >0){
                if(dir ==2){
                    for(int i =top ; i<=bottom; i++){
                        System.out.print(arr[i][right]+",");
                        count--;
                    }
                    right = right-1;
                    dir = 3;
                }
            }

            if(count >0){
                if(dir ==3){
                    for(int i =right ; i>=left; i--){
                        System.out.print(arr[bottom][i]+",");
                        count--;
                    }
                    bottom = bottom-1;
                    dir = 4;
                }
            }

            if(count >0){
                if(dir ==4){
                    for(int i =bottom ; i>=top; i--){
                        System.out.print(arr[i][left]+",");
                        count--;
                    }
                    left = left+1;
                    dir = 1;
                }
            }
        }

    }

    private static void printWavePatternRow(int[][] arr) {
        //ex array :
        // 11 12 13 14
        // 21 22 23 24
        // 31 32 33 34
        // 41 42 43 44
        //output : 11,12,13,14,24,23,22,21,31,34,33,34,44,43,42,41

        for(int i =0; i<arr.length; i++){
            if(i%2 == 0 ){
                for(int j =0; j<arr[i].length; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }else{
                for(int j = arr[i].length-1; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

    private static int[][] takeInput() {
        System.out.println("Enter number of rows : ");
        int r = sc.nextInt();

        int[][] arr = new int[r][];

        System.out.println("Enter number of rows : ");

        for(int i =0; i<r; i++){
            System.out.println("Enter number of cols for row : "+i);
            int c= sc.nextInt();
            arr[i] = new int[c];

            for (int j =0; j<c;j++){
                System.out.println("Enter value for row : "+i+" and col : "+j);
                arr[i][j] = sc.nextInt();
            }

        }

        return arr;
    }

    private static int[][] prepopulateArray() {
        //int[][] arr = new int[3][3];
        int[][] arr ={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        return arr;
    }

    private static void display(int[][] arr) {
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
