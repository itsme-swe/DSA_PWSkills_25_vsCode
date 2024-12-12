package arrayAndArrayList.arrays.singleDimensionalArrays.questionsOnArrays;

public class sortArrayInZerosAndOnes {

    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 1,1,1, 0, 0};

        int n = arr.length;

        int noOfZeros = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) noOfZeros++;
        }

        for (int i = 0; i < n; i++) {

            if (i < noOfZeros) arr[i] = 0;
            else arr[i] = 1;
        }

        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}

/*
*  Output: 0 0 0 0 1 1 1 1
* This is two pass solution means in this solution we are using two for loops to iterate an array.
* */
