/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above.

Leetcode: https://leetcode.com/problems/pascals-triangle/description/
*/

package arrayAndArrayList.arrayList.MultiDimensionalArrayList;

import java.util.ArrayList;
import java.util.List;

public class generatePascalTriangle_LeetCode {

    public static void main(String[] args) {

        int n = 5;

        List<List<Integer>> ans = generate(n);

       printList(ans);
    }

    public static void printList(List<List<Integer>> arr) {
        for (List<Integer> row : arr) {
            for(Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int n) {

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {   // Loop to generate each row

            List<Integer> l = new ArrayList<>();    // Create a new list for the current row

            // Loop to fill elements in the current row
            for (int j = 0; j <= i; j++) {
                // The First and last element of each row is always 1
                if (j == 0 || j == i) l.add(1);
                else {
                    l.add( ans.get(i-1).get(j) + ans.get(i-1).get(j-1));    // Calculate the value
                    // by adding the two elements from the previous row
                }
            }
            ans.add(l);
        }
        return ans;
    }

}

/*
💥 Code Explanation : Yeh code n rows ke liye Pascal's Triangle generate karta hai aur usse print karta hai. Pascal's Triangle ek triangular array hai jisme har element apne upar wale row ke do elements ka sum hota hai, except pehla aur last element har row ka, jo hamesha 1 hote hain.

🔸Output:
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1

*/