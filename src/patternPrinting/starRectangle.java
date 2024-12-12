package patternPrinting;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
