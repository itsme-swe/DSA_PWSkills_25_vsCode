package Strings.methodsOfString;

import java.util.Scanner;

public class charAtMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth city: ");

        String city = sc.nextLine();

        System.out.println(city.charAt(2)); // charAt() method used to fetch individual char at given indexVal
    }
}
