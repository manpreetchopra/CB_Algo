package cb.algo.array_1d;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOps {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        operations();
    }

    public static void operations() {
        int input = -1;
        int[] arr = null;
        do {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("********************************************************");
            System.out.println("                1-D Array Operations : ");
            System.out.println(" Current Array : " + Arrays.toString(arr));
            System.out.println("********************************************************");
            System.out.println("0. Exit ");
            System.out.println("1. Use predefined array");
            System.out.println("2. Initialize a custom array");
            System.out.println("3. Display the Array");
            System.out.println("4. Print Max element");
            System.out.println("5. Find an element (linear search)");
            System.out.println("6. Find an element (binary search)");
            System.out.println("7. Bubble Sort");
            System.out.println("8. Selection Sort");
            System.out.println("9. Insertion Sort");
            System.out.println("10. Lower Bound");
            System.out.println("11. Upper Bound");

            input = sc.nextInt();

            switch (input) {
                case 1:
                    arr = prepopulateArray();
                    System.out.println("Array Pre-populated with values : " + Arrays.toString(arr));
                    break;
                case 2:
                    arr = takeInput();
                    System.out.println("Array initialized wit values : " + Arrays.toString(arr));
                    break;
                case 3:
                    display(arr);
                    break;
                case 4:
                    int max = maxInArray(arr);
                    System.out.println("Array : " + Arrays.toString(arr));
                    System.out.println("Max element is : " + max);
                    break;
                case 5:
                    int idx = linearSearch(arr);
                    System.out.println("Array : " + Arrays.toString(arr));
                    System.out.println("Item found at index : " + idx);
                    break;
                case 6:
                    int idxb = binarySearch(arr);
                    System.out.println("Array : " + Arrays.toString(arr));
                    System.out.println("Item found at index : " + idxb);
                    break;

                case 7:
                    bubbleSort(arr);
                    System.out.println("Sorted Array : " + Arrays.toString(arr));
                    break;
                case 8:
                    selectionSort(arr);
                    System.out.println("Sorted Array : " + Arrays.toString(arr));
                    break;

                case 9:
                    insertionSort(arr);
                    System.out.println("Sorted Array : " + Arrays.toString(arr));
                    break;

                case 10:
                    int lo = lowerBound(arr);
                    System.out.println("Array is : " + Arrays.toString(arr));
                    System.out.println("Lower Bound of item is : " + lo);
                    break;

                case 11:
                    int hi = upperBound(arr);
                    System.out.println("Array is : " + Arrays.toString(arr));
                    System.out.println("Upper Bound of item is : " + hi);
                    break;

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


    private static int[] prepopulateArray() {
        int[] arr = {20, 30, 40, 10, 50};
        return arr;
    }

    private static int[] takeInput() {
        System.out.println("Enter number of elems : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static void display(int[] arr) {
        displayWithFor(arr);
        displayWithEnhancedFor(arr);
    }

    private static void displayWithFor(int[] arr) {
        System.out.println("Array elements are : (Using for loop)");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void displayWithEnhancedFor(int[] arr) {
        System.out.println("Array Elements are : (Using enhanced for)");
        for (int num : arr) {
            System.out.println(num);
        }
    }

    private static int maxInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int linearSearch(int[] arr) {
        System.out.println("Number to search : ");
        int item = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr) {
        System.out.println("Array need to be sorted first : sorting using inbuilt mentho");
        Arrays.sort(arr);
        System.out.println("Enter item to search : ");
        int item = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (item < arr[mid]) {
                high = mid - 1;
            } else if (item > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static void bubbleSort(int[] arr) {
        for (int counter = 0; counter < arr.length - 1; counter++) {
            for (int i = 0; i < arr.length - 1 - counter; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void selectionSort(int[] arr) {
        for (int counter = 0; counter < arr.length - 1; counter++) {
            int min = counter;
            for (int i = counter + 1; i < arr.length; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            swap(arr, counter, min);

        }
    }

    private static void insertionSort(int[] arr) {
        for (int counter = 1; counter < arr.length; counter++) {
            int val = arr[counter];
            int j = counter - 1;
            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
    }

    public static int lowerBound(int arr[]) {
        System.out.println("Enter the item to search : ");
        int item = sc.nextInt();

        int ans = -1;
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (item == arr[mid]) {
                ans = mid;
                hi = mid - 1;
            } else if (item < arr[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return ans;
    }

    public static int upperBound(int arr[]) {
        System.out.println("Enter the item to search : ");
        int item = sc.nextInt();

        int ans = -1;
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (item == arr[mid]) {
                ans = mid;
                lo = mid + 1;
            } else if (item < arr[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return ans;
    }

}
