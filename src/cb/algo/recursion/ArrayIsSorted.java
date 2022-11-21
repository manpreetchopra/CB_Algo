package cb.algo.recursion;

import java.util.Scanner;

public class ArrayIsSorted {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of array elems :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elems ");
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean isSortedArr  = isSortedArr(arr,0);
        System.out.println("Is array sorted : "+isSortedArr);

    }

    private static boolean isSortedArr(int[] arr, int si) {
        if(arr.length-1 == si){
            return true;
        }

        if(arr[si]>arr[si+1]) {
            return false;
        }

        boolean isSorted = isSortedArr(arr,si+1);
        return isSorted;

    }
}

