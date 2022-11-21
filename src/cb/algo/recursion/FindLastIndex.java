package cb.algo.recursion;

import java.util.Scanner;

public class FindLastIndex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of array elems :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elems ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Find elem : ");
        int data = sc.nextInt();
        int lasIIndex = findLastIndex(arr,0,data);
        System.out.println(lasIIndex);
    }

    private static int findLastIndex(int[] arr, int si, int data) {
        if(arr.length == si){
            return -1;
        }
        int lastIndex = findLastIndex(arr, si+1, data);
        if(lastIndex == -1) {
            if (arr[si] == data) {
                return si;
            } else {
                return -1;
            }
        }else{
            return lastIndex;
        }
    }
}