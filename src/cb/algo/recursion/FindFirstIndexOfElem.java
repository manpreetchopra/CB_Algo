package cb.algo.recursion;

import java.util.Scanner;

public class FindFirstIndexOfElem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of array elems :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elems ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter elem to find :");
        int data = sc.nextInt();
        int fIndex = findFirstIndex(arr, 0, data);
        System.out.println("First Index is  : " + fIndex);

    }

    private static int findFirstIndex(int[] arr, int si, int data) {
        if (arr.length == si) {
            return -1;
        }

        if (arr[si] == data) {
            return si;
        } else {
            int fIndex = findFirstIndex(arr, si + 1, data);
            return fIndex;
        }
    }
}