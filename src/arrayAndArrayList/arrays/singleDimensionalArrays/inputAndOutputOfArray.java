package arrayAndArrayList.arrays.singleDimensionalArrays;

import java.util.Scanner;

public class inputAndOutputOfArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Now enter the elements of an array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Output: 10 20 30 40 50
