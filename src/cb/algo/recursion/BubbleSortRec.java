package cb.algo.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortRec {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of array elems :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elems ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr,0,arr.length-1);
        System.out.println("Sorted Array : "+ Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int si, int li) {

        if(li == 0){
            return;
        }

        if(si == li){
            bubbleSort(arr,0,li-1);
            return;
        }

        if(arr[si] > arr[si+1]){
            swap(arr, si, si+1);
        }
        bubbleSort(arr,si+1,li);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}