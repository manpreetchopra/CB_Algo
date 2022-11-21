package cb.algo.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class FindAllIndices {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of array elems :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elems ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to find : ");
        int data = sc.nextInt();

        int[] res = findAllIndices(arr,data,0,0);
        System.out.println("Elem found at indices : "+ Arrays.toString(res));

    }

    private static int[] findAllIndices(int[] arr, int data, int si, int count) {
        int[] indices = null;

        if(arr.length == si){
            indices= new int[count];
            return indices;
        }

        if(arr[si] == data){
            indices = findAllIndices(arr, data, si+1, count+1);
        }else{
            indices = findAllIndices(arr, data, si+1, count);
        }

        if(arr[si] == data) {
            indices[count] = si;
        }

        return indices;
    }
}