package patternPrinting.specialTriangles;

import java.util.Scanner;

public class oddNumTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i<= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }
    }
}

/*

1
1 3
1 3 5
1 3 5 7

* */
