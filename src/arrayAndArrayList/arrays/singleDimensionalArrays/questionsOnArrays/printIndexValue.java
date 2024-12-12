/*
1️⃣ Given an array of marks of students, if the mark is less than 35 print its roll number. [roll number refers to index value]

*/

package arrayAndArrayList.arrays.singleDimensionalArrays.questionsOnArrays;

public class printIndexValue {

    public static void main(String[] args) {

        int [] marks = {45, 40, 30, 55, 32, 60};

        System.out.print("The roll numbers are : ");
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                System.out.printf("%d ",i);
            }
        }
    }
}

// Output: The roll numbers are : 2 4