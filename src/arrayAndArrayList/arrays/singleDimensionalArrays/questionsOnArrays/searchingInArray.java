package arrayAndArrayList.arrays.singleDimensionalArrays.questionsOnArrays;

import java.util.Scanner;

public class searchingInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();


        System.out.print("Now Enter the elements inside an array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Please enter the value to be searched inside an array: ");
        int val = sc.nextInt();

        // Linear search for the value
        boolean found = false; // Initially assume the value is not found
        for (int i = 0; i < n; i++) {
            if (arr[i] == val) {
                found = true;   // this will be true only if value is found
                break;
            }
        }
        if (found) System.out.println("Value found");
        else System.out.println("Value not found");

    }
}
