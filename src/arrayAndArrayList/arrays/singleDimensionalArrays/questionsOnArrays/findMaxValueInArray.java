package arrayAndArrayList.arrays.singleDimensionalArrays.questionsOnArrays;

public class findMaxValueInArray {

    public static void main(String[] args) {

        // Approach - 1 jismae hum apne array ki pheli value ko max maan rahe hai
        int [] arr = {20, 10, 55, 5, 25};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("The max value in array is %d", max);
        // Output : The max value in array is 55

        System.out.println();

        // Approach - 2 ismae hum max variable mae integer ki sabse choti value ko maan kae chalte hai ki yae max hai yae hum negative values pae bhi use kar sukte hai

        int [] newArr = {-10, 2, -5, -1, -20};

        int mx = Integer.MIN_VALUE;

        for (int i = 0 ; i < newArr.length; i++) {
            if (newArr[i] > mx) {
                mx = newArr[i];
            }
        }
        System.out.printf("The max value in this array is %d", mx);
        // Output: The max value in this array is 2

    }
}
