/*
🍁 Sort the array of 0's, 1's and 2's. (Dutch Flag Algorithm)
* */
package arrayAndArrayList.arrays.singleDimensionalArrays.questionsOnArrays;

public class dutchFlagAlgo {

    public static void main(String[] args) {

        int [] arr = {0, 1, 2, 0, 2, 2, 1, 1, 1, 2, 0, 0, 2};

        int n = arr.length;

        int low = 0;
        int mid = 0;
        int high = n-1;

        while (mid <= high) {
            if(arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else {
                swap(arr, high, mid);
                high--;
            }
        }

        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

/*
* Output: 0 0 0 0 1 1 1 1 2 2 2 2 2

*/
