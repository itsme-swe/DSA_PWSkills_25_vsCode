package patternPrinting;

import java.util.Scanner;

public class numberRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of row: ");
        int r = sc.nextInt();

        System.out.print("Enter the value of col: ");
        int col = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
   1 1 1 1 1
   2 2 2 2 2
   3 3 3 3 3
*/