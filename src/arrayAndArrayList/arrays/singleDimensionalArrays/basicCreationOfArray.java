package arrayAndArrayList.arrays.singleDimensionalArrays;

public class basicCreationOfArray {

    public static void main(String[] args) {

        int [] nums = new int[5];   // This will create 5 boxes in memory of integer type and this known as declaration of array

        // Initialising individual elements
        nums[0] = 10;
        nums[1] = 5;
        nums[2] = 15;
        nums[3] = 20;
        nums[4] = 2;

        System.out.println(nums[1]);    // 5
    }
}
